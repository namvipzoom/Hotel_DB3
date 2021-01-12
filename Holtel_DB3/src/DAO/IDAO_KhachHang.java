/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.KhachHang;
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
public class IDAO_KhachHang implements IDAO_Manager<KhachHang, Integer, String, Boolean> {

    @Override
    public List<KhachHang> getAllData() {
        List<KhachHang> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_KhachHang()}");
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt("maKhachHang"));
                kh.setTenKhachHang(rs.getString("tenKhachHang"));
                kh.setDienThoai(rs.getString("dienThoai"));
                kh.setCMND(rs.getString("CMND"));
                kh.setGhiChu(rs.getString("ghiChu"));
                kh.setSoLuot(rs.getInt("soLuot"));
                kh.setTrangThai(rs.getBoolean("trangThai"));
                data.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public KhachHang findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maKhachHang(?)}", id);
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt("maKhachHang"));
                kh.setTenKhachHang(rs.getString("tenKhachHang"));
                kh.setDienThoai(rs.getString("dienThoai"));
                kh.setCMND(rs.getString("CMND"));
                kh.setGhiChu(rs.getString("ghiChu"));
                kh.setSoLuot(rs.getInt("soLuot"));
                kh.setTrangThai(rs.getBoolean("trangThai"));
                return kh;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<KhachHang> findDataByName(String name) {
        List<KhachHang> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenKhachHang(?)}", name);
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt("maKhachHang"));
                kh.setTenKhachHang(rs.getString("tenKhachHang"));
                kh.setDienThoai(rs.getString("dienThoai"));
                kh.setCMND(rs.getString("CMND"));
                kh.setGhiChu(rs.getString("ghiChu"));
                kh.setSoLuot(rs.getInt("soLuot"));
                kh.setTrangThai(rs.getBoolean("trangThai"));
                data.add(kh);

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<KhachHang> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(KhachHang kh) {
        Connection_DB.executeUpdate("{Call add_KhachHang(?,?,?,?,?,?)}", kh.getTenKhachHang(), kh.getDienThoai(), kh.getCMND(), kh.getGhiChu(), kh.getSoLuot(), kh.getTrangThai());
    }

    @Override
    public void updateData(KhachHang kh) {
        Connection_DB.executeUpdate("{Call update_KhachHang(?,?,?,?,?,?,?)}", kh.getMaKhachHang(), kh.getTenKhachHang(), kh.getDienThoai(), kh.getCMND(), kh.getGhiChu(), kh.getSoLuot(), kh.getTrangThai());
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_KhachHang(?)}", id);
    }

    public List<KhachHang> findDataByCMND_SDT(String CMND_SDT) {
        List<KhachHang> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{CALL find_CMND_SDT(?)}", CMND_SDT);
        try {
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKhachHang(rs.getInt("maKhachHang"));
                kh.setTenKhachHang(rs.getString("tenKhachHang"));
                kh.setDienThoai(rs.getString("dienThoai"));
                kh.setCMND(rs.getString("CMND"));
                kh.setGhiChu(rs.getString("ghiChu"));
                kh.setSoLuot(rs.getInt("soLuot"));
                kh.setTrangThai(rs.getBoolean("trangThai"));
                data.add(kh);

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

}
