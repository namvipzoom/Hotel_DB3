/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.DanhMuc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dell
 */

public class IDAO_DanhMuc implements IDAO_Manager<DanhMuc, Integer, String, Boolean>{

    @Override
    public List<DanhMuc> getAllData() {
        List<DanhMuc> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_DanhMuc}");
        try {
            while (rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMaDanhMuc(rs.getInt("maDanhMuc"));
                dm.setTenDanhMuc(rs.getString("tenDanhMuc"));
                dm.setGiaPhong(rs.getFloat("giaPhong"));
                dm.setGhiChu(rs.getString("ghiChu"));
                dm.setTrangThai(rs.getBoolean("trangThai"));
                data.add(dm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DanhMuc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }

    @Override
    public DanhMuc findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maDanhMuc(?)}",id);
        try {
            while (rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMaDanhMuc(rs.getInt("maDanhMuc"));
                dm.setTenDanhMuc(rs.getString("tenDanhMuc"));
                dm.setGiaPhong(rs.getFloat("giaPhong"));
                dm.setGhiChu(rs.getString("ghiChu"));
                dm.setTrangThai(rs.getBoolean("trangThai"));
                return dm;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DanhMuc.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public List<DanhMuc> findDataByName(String name) {
         List<DanhMuc> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenDanhMuc(?)}",name);
        try {
            while (rs.next()) {
                DanhMuc dm = new DanhMuc();
                dm.setMaDanhMuc(rs.getInt("maDanhMuc"));
                dm.setTenDanhMuc(rs.getString("tenDanhMuc"));
                dm.setGiaPhong(rs.getFloat("giaPhong"));
                dm.setGhiChu(rs.getString("ghiChu"));
                dm.setTrangThai(rs.getBoolean("trangThai"));
                data.add(dm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DanhMuc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return data;
    }

    @Override
    public List<DanhMuc> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(DanhMuc dm) {
        Connection_DB.executeUpdate("{Call add_DanhMuc(?,?,?,?)}", dm.getTenDanhMuc(),dm.getGiaPhong(),dm.getGhiChu(),dm.getTrangThai());
    }

    @Override
    public void updateData(DanhMuc dm) {
         Connection_DB.executeUpdate("{Call update_DanhMuc(?,?,?,?,?)}", dm.getMaDanhMuc(),dm.getTenDanhMuc(),dm.getGiaPhong(),dm.getGhiChu(),dm.getTrangThai());
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_DanhMuc(?)}", id);
    }
    
}
