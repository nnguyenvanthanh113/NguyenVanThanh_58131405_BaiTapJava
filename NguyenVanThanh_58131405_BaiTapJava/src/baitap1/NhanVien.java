/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author ThanhMickey
 */
public class NhanVien {
    String ten,tuoi,diaChi;
    double tienLuong;
    int tongSoGio;

    public NhanVien() {
    }

    public NhanVien(String ten, String tuoi, String diaChi, double tienLuong, int tongSoGio) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGio = tongSoGio;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGio() {
        return tongSoGio;
    }

    public void setTongSoGio(int tongSoGio) {
        this.tongSoGio = tongSoGio;
    }
    
    public String getThongTin()
    {
        return "Ten :"+getTen()+" "+"Tuoi :"+getTuoi()+" "
                +"DiaChi :"+getDiaChi();
    }
    public double tinhThuong(){
        if(getTongSoGio() >= 200)
            return getTienLuong()*0.2;
        if(getTongSoGio() < 200 && getTongSoGio() >= 100)
            return tienLuong*0.1;
//        if(getTongSoGio() < 100)
//            return 0;
        return 0;
    }
}
