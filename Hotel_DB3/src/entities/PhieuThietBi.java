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
public class PhieuThietBi {
    private int maDanhMuc;
    private int phong;
    private int maThietBi;
    private int soLuong;
    private String ghiChu;
    private boolean trangThai;
    private String tenDanhMuc;
    private String tenThietBi;

    public PhieuThietBi(int maDanhMuc, int phong, int maThietBi, int soLuong, String ghiChu, boolean trangThai, String tenDanhMuc, String tenThietBi) {
        this.maDanhMuc = maDanhMuc;
        this.phong = phong;
        this.maThietBi = maThietBi;
        this.soLuong = soLuong;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.tenDanhMuc = tenDanhMuc;
        this.tenThietBi = tenThietBi;
    }

    public PhieuThietBi() {
    }

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public int getPhong() {
        return phong;
    }

    public void setPhong(int phong) {
        this.phong = phong;
    }

    public int getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(int maThietBi) {
        this.maThietBi = maThietBi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }
}
