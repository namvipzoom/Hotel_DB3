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
public class PhieuDichVu {

    private int maPhieuDichVu;
    private int maDichVu;
    private int maPhieuThuePhong;
    private int maPhong;
    private String ghiChu;
    private boolean trangThai;

    public PhieuDichVu() {
    }

    public PhieuDichVu(int maPhieuDichVu, int maDichVu, int maPhieuThuePhong, int maPhong, String ghiChu, boolean trangThai) {
        this.maPhieuDichVu = maPhieuDichVu;
        this.maDichVu = maDichVu;
        this.maPhieuThuePhong = maPhieuThuePhong;
        this.maPhong = maPhong;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
    }

    public int getMaPhieuDichVu() {
        return maPhieuDichVu;
    }

    public void setMaPhieuDichVu(int maPhieuDichVu) {
        this.maPhieuDichVu = maPhieuDichVu;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public int getMaPhieuThuePhong() {
        return maPhieuThuePhong;
    }

    public void setMaPhieuThuePhong(int maPhieuThuePhong) {
        this.maPhieuThuePhong = maPhieuThuePhong;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
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
    
    

}
