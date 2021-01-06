/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author DUY
 */
public class PhieuThuePhong {

    private int maThuePhong;
    private int maHoaDon;
    private int maPhong;
    private String ngayDen;
    private String ngayDi;
    private float tongTien;
    private String ghiChu;
    private Boolean trangThai;

    public PhieuThuePhong() {
    }

    public PhieuThuePhong(int maThuePhong, int maHoaDon, int maPhong, String ngayDen, String ngayDi, float tongTien, String ghiChu, Boolean trangThai) {
        this.maThuePhong = maThuePhong;
        this.maHoaDon = maHoaDon;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.tongTien = tongTien;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public int getMaThuePhong() {
        return maThuePhong;
    }

    public void setMaThuePhong(int maThuePhong) {
        this.maThuePhong = maThuePhong;
    }

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
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
    
    

}
