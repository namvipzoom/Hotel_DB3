/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connect.Connection_DB;
import entities.HoaDon;
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
public class IDAO_HoaDon implements IDAO_Manager<HoaDon, Integer, Object, Boolean>{

    @Override
    public List<HoaDon> getAllData() {
        List<HoaDon> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call getAll_HoaDon()}");
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("maHoaDon"));
                hd.setMaNhanVien(rs.getString("maNhanVien"));
                hd.setMaKhachHang(rs.getInt("maKhachHang"));
                hd.setMaPhong(rs.getInt("maPhong"));
                hd.setTenNhanVien(rs.getString("tenNhanVien"));
                hd.setTenPhong(rs.getString("tenPhong"));
                hd.setNgayDen(rs.getString("ngayDen"));
                hd.setNgayDi(rs.getString("ngayDi"));
                hd.setDatCoc(rs.getFloat("datCoc"));
                hd.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                hd.setTongTien(rs.getFloat("tongTien"));
                hd.setGhiChu(rs.getString("ghiChu"));
                hd.setTrangThai(rs.getBoolean("trangThai"));
                data.add(hd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public HoaDon findDataById(Integer id) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_maHoaDon(?)}",id);
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("maHoaDon"));
                hd.setMaNhanVien(rs.getString("maNhanVien"));
                hd.setMaKhachHang(rs.getInt("maKhachHang"));
                hd.setMaPhong(rs.getInt("maPhong"));
                hd.setTenNhanVien(rs.getString("tenNhanVien"));
                hd.setTenPhong(rs.getString("tenPhong"));
                hd.setNgayDen(rs.getString("ngayDen"));
                hd.setNgayDi(rs.getString("ngayDi"));
                hd.setDatCoc(rs.getFloat("datCoc"));
                hd.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                hd.setTongTien(rs.getFloat("tongTien"));
                hd.setGhiChu(rs.getString("ghiChu"));
                hd.setTrangThai(rs.getBoolean("trangThai"));
                return hd;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public List<HoaDon> findDataByStatus(Integer id) {
        List<HoaDon> data = new ArrayList<>();
        ResultSet rs = Connection_DB.executeQuery("{Call get_HoaDon_Status(?)}",id);
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
               hd.setMaHoaDon(rs.getInt("maHoaDon"));
                hd.setMaNhanVien(rs.getString("maNhanVien"));
                hd.setMaKhachHang(rs.getInt("maKhachHang"));
                hd.setMaPhong(rs.getInt("maPhong"));
                hd.setTenNhanVien(rs.getString("tenNhanVien"));
                hd.setTenPhong(rs.getString("tenPhong"));
                hd.setNgayDen(rs.getString("ngayDen"));
                hd.setNgayDi(rs.getString("ngayDi"));
                hd.setDatCoc(rs.getFloat("datCoc"));
                hd.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                hd.setTongTien(rs.getFloat("tongTien"));
                hd.setGhiChu(rs.getString("ghiChu"));
                hd.setTrangThai(rs.getBoolean("trangThai"));
                data.add(hd);

            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    public HoaDon findDataByCMND(String CMND) {
        ResultSet rs = Connection_DB.executeQuery("{Call find_HoaDonBy_CMND(?)}",CMND);
        try {
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setMaHoaDon(rs.getInt("maHoaDon"));
                hd.setMaNhanVien(rs.getString("maNhanVien"));
                hd.setMaKhachHang(rs.getInt("maKhachHang"));
                hd.setMaPhong(rs.getInt("maPhong"));
                hd.setTenNhanVien(rs.getString("tenNhanVien"));
                hd.setTenPhong(rs.getString("tenPhong"));
                hd.setNgayDen(rs.getString("ngayDen"));
                hd.setNgayDi(rs.getString("ngayDi"));
                hd.setDatCoc(rs.getFloat("datCoc"));
                hd.setMaKhuyenMai(rs.getInt("maKhuyenMai"));
                hd.setTongTien(rs.getFloat("tongTien"));
                hd.setGhiChu(rs.getString("ghiChu"));
                hd.setTrangThai(rs.getBoolean("trangThai"));
                return hd;
            }
        } catch (SQLException ex) {
            Logger.getLogger(IDAO_HoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    @Override
    public List<HoaDon> findDataByName(Object name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<HoaDon> findDataByStatus(Boolean status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertData(HoaDon hd) {
<<<<<<< HEAD
        Connection_DB.executeUpdate("{Call insert_HoaDon(?,?,?,?,?,?,?,?,?,?)}", hd.getMaNhanVien(),hd.getMaKhachHang(),hd.getMaPhong(),hd.getNgayDen(),hd.getNgayDi(),hd.getDatCoc(),
                hd.getMaKhuyenMai(),hd.getTongTien(),hd.getGhiChu(),hd.getTrangThai());
=======
        Connection_DB.executeUpdate("{Call insert_HoaDon(?,?,?,?,?,?,?,?,?,?,?)}", hd.getMaNhanVien(),hd.getMaKhachHang(),hd.getMaPhong(),hd.getNgayDen(),hd.getNgayDi(),hd.getDatCoc(),
                hd.getMaKhuyenMai(),hd.getTongTien(),hd.getGhiChu(),hd.isTrangThai(),hd.getSoLuot());
>>>>>>> 720fdf34d7a44ae981af4c3ab85ed0c74fa30160
    }

    @Override
    public void updateData(HoaDon hd) {
        Connection_DB.executeUpdate("{Call update_HoaDon(?,?,?,?,?,?,?,?,?,?,?)}", hd.getMaHoaDon(),hd.getMaNhanVien(),hd.getMaKhachHang(),hd.getMaPhong(),hd.getNgayDen(),hd.getNgayDi(),hd.getDatCoc(),
                hd.getMaKhuyenMai(),hd.getTongTien(),hd.getGhiChu(),hd.getTrangThai());
    }

    @Override
    public void deleteData(Integer id) {
        Connection_DB.executeUpdate("{Call delete_HoaDon(?)}", id);
    }
    
}
