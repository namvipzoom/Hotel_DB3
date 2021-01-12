/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.KhuyenMai;
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
public class IDAO_KhuyenMai implements IDAO_Manager<KhuyenMai, Integer, String, Boolean> {

    @Override
    public List<KhuyenMai> getAllData() {
        List<KhuyenMai> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_KhuyenMai}");
        try {
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                km.setTenKhuyenMai(rs.getString("tenKhuyenMai"));
                km.setNoiDung(rs.getString("noiDung"));
                km.setGiaTri(rs.getFloat("giaTri"));
                km.setTrangThai(rs.getBoolean("trangThai"));
                data.add(km);

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_KhuyenMai.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public KhuyenMai findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maKhuyenMai(?)}", id);
        try {
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                km.setTenKhuyenMai(rs.getString("tenKhuyenMai"));
                km.setNoiDung(rs.getString("noiDung"));
                km.setGiaTri(rs.getFloat("giaTri"));
                km.setTrangThai(rs.getBoolean("trangThai"));
                return km;

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<KhuyenMai> findDataByName(String name) {
        List<KhuyenMai> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenKhuyenMai(?)}", name);
        try {
            while (rs.next()) {
                KhuyenMai km = new KhuyenMai();
                km.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                km.setTenKhuyenMai(rs.getString("tenKhuyenMai"));
                km.setNoiDung(rs.getString("noiDung"));
                km.setGiaTri(rs.getFloat("giaTri"));
                km.setTrangThai(rs.getBoolean("trangThai"));
                data.add(km);

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_DichVu.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<KhuyenMai> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(KhuyenMai km) {
        Connection_DB.executeUpdate("{Call add_KhuyenMai(?,?,?,?)}", km.getTenKhuyenMai(), km.getNoiDung(), km.getGiaTri(), km.getTrangThai());
    }

    @Override
    public void updateData(KhuyenMai km) {
        Connection_DB.executeUpdate("{Call update_KhuyenMai(?,?,?,?,?)}", km.getMaKhuyenMai(), km.getTenKhuyenMai(), km.getNoiDung(), km.getGiaTri(), km.getTrangThai());
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_KhuyenMai(?)}", id);
    }

}
