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
public class XeNgoaiThanh extends ChuyenXe{
    String maSoChuyen,hoTenTaiXe,soXe,noiDen,soNgayDi,doanhThu;

    public XeNgoaiThanh() {
    }

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, String noiDen, String soNgayDi, String doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
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

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(String soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    public String getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(String doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    
}
