/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author DUY
 */
public class HoaDon {

    private int maHoaDon;
    private String maNhanVien;
    private int maKhachHang;
    private int maPhong;
    private String ngayDen;
    private String ngayDi;
    private float datCoc;
    private int maKhuyenMai;
    private float tongTien;
    private String ghiChu;
    private int soLuot;
    private Boolean trangThai;
    private String tenNhanVien;
    private String tenPhong;

    public HoaDon() {
    }

    public HoaDon(int maHoaDon, String maNhanVien, int maKhachHang, int maPhong, String ngayDen, String ngayDi, float datCoc, int maKhuyenMai, float tongTien, String ghiChu, boolean trangThai, int soLuot) {

        this.maHoaDon = maHoaDon;
        this.maNhanVien = maNhanVien;
        this.maKhachHang = maKhachHang;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.datCoc = datCoc;
        this.maKhuyenMai = maKhuyenMai;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.tenNhanVien = tenNhanVien;
        this.tenPhong = tenPhong;
        this.soLuot = soLuot;

    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public float getDatCoc() {
        return datCoc;
    }

    public void setDatCoc(float datCoc) {
        this.datCoc = datCoc;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getSoLuot() {
        return soLuot;
    }

    public void setSoLuot(int soLuot) {
        this.soLuot = soLuot;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHoaDon=" + maHoaDon + ", maNhanVien=" + maNhanVien + ", maKhachHang=" + maKhachHang + ", maPhong=" + maPhong + ", ngayDen=" + ngayDen + ", ngayDi=" + ngayDi + ", datCoc=" + datCoc + ", maKhuyenMai=" + maKhuyenMai + ", tongTien=" + tongTien + ", ghiChu=" + ghiChu + ", trangThai=" + trangThai + ", soLuot=" + soLuot + '}';
    }

}
