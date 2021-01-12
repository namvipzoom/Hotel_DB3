/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.Phong;
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
public class IDAO_Phong implements IDAO_Manager<Phong, Integer, String, Boolean> {

    @Override
    public List<Phong> getAllData() {
        List<Phong> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_Phong}");
        try {
            while (rs.next()) {
                Phong p = new Phong();
                p.setMaPhong(rs.getInt("maPhong"));
                p.setTenPhong(rs.getString("tenPhong"));
                p.setLoaiPhong(rs.getInt("loaiPhong"));
                p.setSoGiuong(rs.getInt("soGiuong"));
                p.setGhiChu(rs.getString("ghiChu"));
                p.setTrangThai(rs.getBoolean("trangThai"));
                p.setTenDanhMuc(rs.getString("tenDanhMuc"));
                data.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public Phong findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maPhong(?)}", id);
        try {
            while (rs.next()) {
                Phong p = new Phong();
                p.setMaPhong(rs.getInt("maPhong"));
                p.setTenPhong(rs.getString("tenPhong"));
                p.setLoaiPhong(rs.getInt("loaiPhong"));
                p.setSoGiuong(rs.getInt("soGiuong"));
                p.setGhiChu(rs.getString("ghiChu"));
                p.setTrangThai(rs.getBoolean("trangThai"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Phong> findDataByName(String name) {
        List<Phong> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenPhong(?)}", name);
        try {
            while (rs.next()) {
                Phong p = new Phong();
                p.setMaPhong(rs.getInt("maPhong"));
                p.setTenPhong(rs.getString("tenPhong"));
                p.setLoaiPhong(rs.getInt("loaiPhong"));
                p.setSoGiuong(rs.getInt("soGiuong"));
                p.setGhiChu(rs.getString("ghiChu"));
                p.setTrangThai(rs.getBoolean("trangThai"));
                p.setTenDanhMuc(rs.getString("tenDanhMuc"));
                data.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_Phong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<Phong> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(Phong p) {
        Connection_DB.executeUpdate("{Call add_Phong(?,?,?,?,?)}", p.getTenPhong(), p.getLoaiPhong(), p.getSoGiuong(), p.getGhiChu(), p.getTrangThai());
    }

    @Override
    public void updateData(Phong p) {
        Connection_DB.executeUpdate("{Call update_Phong(?,?,?,?,?,?)}", p.getMaPhong(), p.getTenPhong(), p.getLoaiPhong(), p.getSoGiuong(), p.getGhiChu(), p.getTrangThai());
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_Phong(?)}", id);
    }

}
