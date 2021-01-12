/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.DichVu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DUY
 */
public class IDAO_DichVu implements IDAO_Manager<DichVu, Integer, String, Boolean>{

    @Override
    public List<DichVu> getAllData() {
        List<DichVu> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_DichVu}");
        try {
            while (rs.next()) {
                DichVu dv = new DichVu();
                dv.setMaDichVu(rs.getInt("maDichVu"));
                dv.setTenDichVu(rs.getString("tenDichVu"));
                dv.setGiaDichVu(rs.getFloat("giaDichVu"));
                dv.setTrangThai(rs.getBoolean("trangThai"));
                data.add(dv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public DichVu findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maDichVu(?)}",id);
        try {
            while (rs.next()) {
                DichVu dv = new DichVu();
                dv.setMaDichVu(rs.getInt("maDichVu"));
                dv.setTenDichVu(rs.getString("tenDichVu"));
                dv.setGiaDichVu(rs.getFloat("giaDichVu"));
                dv.setTrangThai(rs.getBoolean("trangThai"));
                return dv;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<DichVu> findDataByName(String name) {
        List<DichVu> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenDichVu(?)}",name);
        try {
            while (rs.next()) {
                DichVu dv = new DichVu();
                dv.setMaDichVu(rs.getInt("maDichVu"));
                dv.setTenDichVu(rs.getString("tenDichVu"));
                dv.setGiaDichVu(rs.getFloat("giaDichVu"));
                dv.setTrangThai(rs.getBoolean("trangThai"));
                data.add(dv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<DichVu> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(DichVu dv) {
        Connection_DB.executeUpdate("{Call add_DichVu(?,?,?)}", dv.getTenDichVu(),dv.getGiaDichVu(),dv.getTrangThai());
    }

    @Override
    public void updateData(DichVu dv) {
        Connection_DB.executeUpdate("{Call update_DichVu(?,?,?,?)}",dv.getMaDichVu() ,dv.getTenDichVu(),dv.getGiaDichVu(),dv.getTrangThai());
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_DichVu(?)}",id);
    }
    
}
