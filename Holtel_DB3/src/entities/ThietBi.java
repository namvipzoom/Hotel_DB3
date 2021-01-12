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
public class ThietBi {

    private int maThietBi;
    private String tenThietBi;
    private float giaThietBi;
    private int soLuong;
    private Boolean trangThai;

    public ThietBi() {
    }

    public ThietBi(int maThietBi, String tenThietBi, float giaThietBi, int soLuong, Boolean trangThai) {
        this.maThietBi = maThietBi;
        this.tenThietBi = tenThietBi;
        this.giaThietBi = giaThietBi;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public int getMaThietBi() {
        return maThietBi;
    }

    public void setMaThietBi(int maThietBi) {
        this.maThietBi = maThietBi;
    }

    public String getTenThietBi() {
        return tenThietBi;
    }

    public void setTenThietBi(String tenThietBi) {
        this.tenThietBi = tenThietBi;
    }

    public float getGiaThietBi() {
        return giaThietBi;
    }

    public void setGiaThietBi(float giaThietBi) {
        this.giaThietBi = giaThietBi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return this.tenThietBi;
    }

}
