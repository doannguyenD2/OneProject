/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dharm
 */
public class quanLy {
    private khachHang khHang;
    private matHang matHang;
    private int soLuong;

    public quanLy() {
    }

    public quanLy(khachHang khHang, matHang matHang, int soLuong) {
        this.khHang = khHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public khachHang getKhHang() {
        return khHang;
    }

    public matHang getMatHang() {
        return matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setKhHang(khachHang khHang) {
        this.khHang = khHang;
    }

    public void setMatHang(matHang matHang) {
        this.matHang = matHang;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public void add(int k)
    {
        soLuong += k;
    }
    
}
