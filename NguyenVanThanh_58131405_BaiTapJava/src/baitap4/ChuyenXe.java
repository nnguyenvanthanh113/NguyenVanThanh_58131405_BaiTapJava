/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author ThanhMickey
 */
public class ChuyenXe {
    String maSoChuyen,hoTenTaiXe,soXe;
    Float doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, Float doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public Float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(Float doanhThu) {
        this.doanhThu = doanhThu;
    }

    
    
    
}
