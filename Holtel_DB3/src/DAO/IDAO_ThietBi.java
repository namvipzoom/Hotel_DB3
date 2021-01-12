/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.ThietBi;
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
public class IDAO_ThietBi implements IDAO_Manager<ThietBi, Integer, String, Boolean>{

    @Override
    public List<ThietBi> getAllData() {
        List<ThietBi> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_ThietBi}");
        try {
            while (rs.next()) {
                ThietBi tb = new ThietBi();
                tb.setMaThietBi(rs.getInt("maThietBi"));
                tb.setTenThietBi(rs.getString("tenThietBi"));
                tb.setGiaThietBi(rs.getFloat("giaThietBi"));
                tb.setSoLuong(rs.getInt("soLuong"));
                tb.setTrangThai(rs.getBoolean("trangThai"));
                data.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public ThietBi findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maThietBi(?)}",id);
        try {
            while (rs.next()) {
                ThietBi tb = new ThietBi();
                tb.setMaThietBi(rs.getInt("maThietBi"));
                tb.setTenThietBi(rs.getString("tenThietBi"));
                tb.setGiaThietBi(rs.getFloat("giaThietBi"));
                tb.setSoLuong(rs.getInt("soLuong"));
                tb.setTrangThai(rs.getBoolean("trangThai"));
                return tb;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<ThietBi> findDataByName(String name) {
        List<ThietBi> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call find_tenThietBi(?)}",name);
        try {
            while (rs.next()) {
                ThietBi tb = new ThietBi();
                tb.setMaThietBi(rs.getInt("maThietBi"));
                tb.setTenThietBi(rs.getString("tenThietBi"));
                tb.setGiaThietBi(rs.getFloat("giaThietBi"));
                tb.setSoLuong(rs.getInt("soLuong"));
                tb.setTrangThai(rs.getBoolean("trangThai"));
                data.add(tb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_ThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public List<ThietBi> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(ThietBi tb) {
        Connection_DB.executeUpdate("{Call add_ThietBi(?,?,?,?)}",tb.getTenThietBi(),tb.getGiaThietBi(),tb.getSoLuong(),tb.getTrangThai() );
    }

    @Override
    public void updateData(ThietBi tb) {
        Connection_DB.executeUpdate("{Call update_ThietBi(?,?,?,?,?)}",tb.getMaThietBi(),tb.getTenThietBi(),tb.getGiaThietBi(),tb.getSoLuong(),tb.getTrangThai() );
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_ThietBi(?)}", id);
    }

    
    
}
