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
public class KhachHang {

    private int maKhachHang;
    private String tenKhachHang;
    private String dienThoai;
    private String CMND;
    private String ghiChu;
    private int soLuot;
    private Boolean trangThai;

    public KhachHang() {
    }

    public KhachHang(int maKhachHang, String tenKhachHang, String dienThoai, String CMND, String ghiChu, int soLuot, Boolean trangThai) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.dienThoai = dienThoai;
        this.CMND = CMND;
        this.ghiChu = ghiChu;
        this.soLuot = soLuot;
        this.trangThai = trangThai;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getSoLuot() {
        return soLuot;
    }

    public void setSoLuot(int soLuot) {
        this.soLuot = soLuot;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    

}
