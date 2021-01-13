/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Connect.Connection_DB;
import entities.PhieuThietBi;
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
public class IDAO_PhieuThietBi implements IDAO_Manager<PhieuThietBi, Integer, Integer, Boolean> {

    @Override
    public List<PhieuThietBi> getAllData() {
        List<PhieuThietBi> listPhieuThietBi = new ArrayList<>();
        ResultSet resultSet = Connect.Connection_DB.executeQuery("{CALL get_AllPhieuThietBi()}");
        try {
            while (resultSet.next()) {
                PhieuThietBi phieuThietBi = new PhieuThietBi();
                phieuThietBi.setMaDanhMuc(resultSet.getInt("maDanhMuc"));
                phieuThietBi.setPhong(resultSet.getInt("maPhong"));
                phieuThietBi.setMaThietBi(resultSet.getInt("maThietBi"));
                phieuThietBi.setSoLuong(resultSet.getInt("soLuong"));
                phieuThietBi.setGhiChu(resultSet.getString("ghiChu"));
                phieuThietBi.setTrangThai(resultSet.getBoolean("trangThai"));
                phieuThietBi.setTenDanhMuc(resultSet.getString("tenDanhMuc"));
                phieuThietBi.setTenThietBi(resultSet.getString("tenThietBi"));
                listPhieuThietBi.add(phieuThietBi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_PhieuThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listPhieuThietBi;
    }

    @Override
    public PhieuThietBi findDataById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PhieuThietBi> findDataByName(Integer name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PhieuThietBi> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(PhieuThietBi t) {
        Connection_DB.executeUpdate("{CALL add_PhieuThietBi(?,?,?,?,?,?)}", t.getMaDanhMuc(), t.getPhong(), t.getMaThietBi(), t.getSoLuong(), t.getGhiChu(), t.isTrangThai());
    }

    @Override
    public void updateData(PhieuThietBi t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{CALL delete_PhieuThietBi(?)}", id);
    }

    public PhieuThietBi finDataToDelete(Integer maThietBi, Integer maPhong) {
        ResultSet resultSet = Connection_DB.executeQuery("{CALL find_PhieuThietBiByTenVaPhong(?,?)}", maThietBi, maPhong);
        try {
            while (resultSet.next()) {
                PhieuThietBi phieuThietBi = new PhieuThietBi();
                phieuThietBi.setMaDanhMuc(resultSet.getInt("maDanhMuc"));
                phieuThietBi.setPhong(resultSet.getInt("maPhong"));
                phieuThietBi.setMaThietBi(resultSet.getInt("maThietBi"));
                phieuThietBi.setSoLuong(resultSet.getInt("soLuong"));
                phieuThietBi.setGhiChu(resultSet.getString("ghiChu"));
                phieuThietBi.setTrangThai(resultSet.getBoolean("trangThai"));
                phieuThietBi.setTenDanhMuc(resultSet.getString("tenDanhMuc"));
                phieuThietBi.setTenThietBi(resultSet.getString("tenThietBi"));
                return phieuThietBi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_PhieuThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<PhieuThietBi> listPhieuThietBiByTen(String ten) {
        List<PhieuThietBi> listPhieuThietBi = new ArrayList<>();
        ResultSet resultSet = Connect.Connection_DB.executeQuery("{CALL find_PhieuThietBiByTen(?)}", ten);
        try {
            while (resultSet.next()) {
                PhieuThietBi phieuThietBi = new PhieuThietBi();
                phieuThietBi.setMaDanhMuc(resultSet.getInt("maDanhMuc"));
                phieuThietBi.setPhong(resultSet.getInt("maPhong"));
                phieuThietBi.setMaThietBi(resultSet.getInt("maThietBi"));
                phieuThietBi.setSoLuong(resultSet.getInt("soLuong"));
                phieuThietBi.setGhiChu(resultSet.getString("ghiChu"));
                phieuThietBi.setTrangThai(resultSet.getBoolean("trangThai"));
                phieuThietBi.setTenDanhMuc(resultSet.getString("tenDanhMuc"));
                phieuThietBi.setTenThietBi(resultSet.getString("tenThietBi"));
                listPhieuThietBi.add(phieuThietBi);
            }
            return listPhieuThietBi;
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_PhieuThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean check_TonTai(Integer maThietBi, Integer maPhong) {
        ResultSet resultSet = Connection_DB.executeQuery("{CALL find_PhieuThietBiByTenVaPhong(?,?)}", maThietBi, maPhong);
        try {
            while (resultSet.next()) {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_PhieuThietBi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }

}