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
public class KhuyenMai {

    private int maKhuyenMai;
    private String tenKhuyenMai;
    private String noiDung;
    private float giaTri;
    private int loaiKhuyenMai;
    private Boolean trangThai;

    public KhuyenMai() {
    }

    public KhuyenMai(int maKhuyenMai, String tenKhuyenMai, String noiDung, float giaTri, int loaiKhuyenMai, Boolean trangThai) {
        this.maKhuyenMai = maKhuyenMai;
        this.tenKhuyenMai = tenKhuyenMai;
        this.noiDung = noiDung;
        this.giaTri = giaTri;
        this.loaiKhuyenMai = loaiKhuyenMai;
        this.trangThai = trangThai;
    }

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public float getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }

    public int getLoaiKhuyenMai() {
        return loaiKhuyenMai;
    }

    public void setLoaiKhuyenMai(int loaiKhuyenMai) {
        this.loaiKhuyenMai = loaiKhuyenMai;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    

}
