/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.PhieuDichVu;
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
public class IDAO_PhieuDichVu implements IDAO_Manager<PhieuDichVu, Integer, Object, Boolean> {

    @Override
    public List<PhieuDichVu> getAllData() {
        List<PhieuDichVu> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_PhieuDichVu}");
        try {
            while (rs.next()) {
                PhieuDichVu pdv = new PhieuDichVu();
                pdv.setMaDichVu(rs.getInt("maDichVu"));
                pdv.setMaPhong(rs.getInt("maPhong"));
                pdv.setTenPhong(rs.getString("tenPhong"));
                pdv.setGiaDichVu(rs.getFloat("giaDichVu"));
                pdv.setGhiChu(rs.getString("ghiChu"));
                pdv.setTrangThai(rs.getBoolean("trangThai"));
                data.add(pdv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public PhieuDichVu findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_PhieuDichVu(?)}", id);
        try {
            while (rs.next()) {
                PhieuDichVu pdv = new PhieuDichVu();
                pdv.setMaDichVu(rs.getInt("maDichVu"));
                pdv.setMaPhong(rs.getInt("maPhong"));
                pdv.setGhiChu(rs.getString("ghiChu"));
                pdv.setTrangThai(rs.getBoolean("trangThai"));
                return pdv;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<PhieuDichVu> findDataByName(Object name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PhieuDichVu> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(PhieuDichVu pdv) {
        Connection_DB.executeUpdate("{Call add_PhieuDichVu(?,?,?,?)}", pdv.getMaDichVu(), pdv.getMaPhong(), pdv.getGhiChu(), pdv.getTrangThai());
    }

    @Override
    public void updateData(PhieuDichVu t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_PhieuDichVu(?)}", id);
    }

}
