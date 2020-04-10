/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author ThanhMickey
 */
public abstract  class SinhVienPoly {
    String hoTen,nganh;

    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public SinhVienPoly() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    public abstract double getDiem();
    public String getHocLuc()
    {
        if(getDiem() < 5)
            return "Yếu";
        if(getDiem() >= 5 && getDiem() < 6.5)
            return "Trung Bình";
        if(getDiem() >= 7.5 && getDiem() < 9)
            return "Giỏi";
        return "Xuất sắc";
    }
    public void xuat()
    {
//        System.out.println("ho tên :" + getHoTen() + " "
//                            + "ngành :" + getNganh() + " "
//                            + "học lực :" + getHocLuc());
        System.out.println("ho tên :" + getHoTen() + " "
                            + "ngành :" + getNganh());
                           
    }
}
