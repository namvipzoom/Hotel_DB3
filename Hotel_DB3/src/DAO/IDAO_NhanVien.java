/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.NhanVien;
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
public class IDAO_NhanVien implements IDAO_Manager<NhanVien, String, String, Boolean>{

    @Override
    public List<NhanVien> getAllData() {
        List<NhanVien> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_NhanVien}");
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("maNhanVien"));
                nv.setTenNhanVien(rs.getString("tenNhanVien"));
                nv.setDienThoai(rs.getString("dienThoai"));
                nv.setGioiTinh(rs.getBoolean("gioiTinh"));
                nv.setGhiChu(rs.getString("ghiChu"));
                nv.setTrangThai(rs.getBoolean("trangThai"));
                data.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public NhanVien findDataById(String id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maNhanVien(?)}",id);
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("maNhanVien"));
                nv.setTenNhanVien(rs.getString("tenNhanVien"));
                nv.setDienThoai(rs.getString("dienThoai"));
                nv.setGioiTinh(rs.getBoolean("gioiTinh"));
                nv.setGhiChu(rs.getString("ghiChu"));
                nv.setTrangThai(rs.getBoolean("trangThai"));
                return nv;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public NhanVien Login(String tk,String mk) {
        ResultSet rs = Connection_DB.executeQuery("{Call login(?,?)}",tk,mk);
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("maNhanVien"));
                nv.setTenNhanVien(rs.getString("tenNhanVien"));
                nv.setDienThoai(rs.getString("dienThoai"));
                nv.setGioiTinh(rs.getBoolean("gioiTinh"));
                nv.setGhiChu(rs.getString("ghiChu"));
                nv.setTrangThai(rs.getBoolean("trangThai"));
                return nv;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public List<NhanVien> findDataByName(String name) {
        List<NhanVien> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenNhanVien(?)}",name);
        try {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString("maNhanVien"));
                nv.setTenNhanVien(rs.getString("tenNhanVien"));
                nv.setDienThoai(rs.getString("dienThoai"));
                nv.setGioiTinh(rs.getBoolean("gioiTinh"));
                nv.setGhiChu(rs.getString("ghiChu"));
                nv.setTrangThai(rs.getBoolean("trangThai"));
                data.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<NhanVien> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(NhanVien nv) {
        Connection_DB.executeUpdate("{Call add_NhanVien(?,?,?,?,?,?)}", nv.getMaNhanVien(),nv.getTenNhanVien(),nv.getDienThoai(),nv.getGioiTinh(),nv.getGhiChu(),nv.getTrangThai());
    }

    @Override
    public void updateData(NhanVien nv) {
        Connection_DB.executeUpdate("{Call update_NhanVien(?,?,?,?,?,?)}", nv.getMaNhanVien(),nv.getTenNhanVien(),nv.getDienThoai(),nv.getGioiTinh(),nv.getGhiChu(),nv.getTrangThai());
    }

    @Override
    public void deleteData(String id) {
        Connection_DB.executeUpdate("{Call delete_NhanVien(?)}", id);
    }
    
}
