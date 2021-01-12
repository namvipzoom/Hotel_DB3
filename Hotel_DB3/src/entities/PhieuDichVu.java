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

    private int maDichVu;
    private int maPhong;
    private String ghiChu;
    private Boolean trangThai;
    private String tenPhong;
    private float giaDichVu ;

    public PhieuDichVu() {
    }

    public PhieuDichVu(int maDichVu, int maPhong, String ghiChu, Boolean trangThai, String tenPhong, float giaDichVu) {
        this.maDichVu = maDichVu;
        this.maPhong = maPhong;
        this.ghiChu = ghiChu;
        this.trangThai = trangThai;
        this.tenPhong = tenPhong;
        this.giaDichVu = giaDichVu;
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
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

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(float giaDichVu) {
        this.giaDichVu = giaDichVu;
    }
            
    

    

    

    

    
}
