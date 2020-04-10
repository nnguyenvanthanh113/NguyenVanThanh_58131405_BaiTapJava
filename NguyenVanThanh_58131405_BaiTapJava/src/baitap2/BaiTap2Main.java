/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author ThanhMickey
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
        
        //nhan vien 1
        NhanVien nv1 = new NhanVien();
        nv1.setTen("Nguyen Van Thanh");
        nv1.setTuoi("22");
        nv1.setDiaChi("Khanh Hoa");
        nv1.setTienLuong(200);
        nv1.setTongSoGio(150);
        quanLyNhanVien.them(nv1);
        
        //nhan vien 2
        NhanVien nv2 = new NhanVien();
        nv2.setTen("Nguyen Thi Thu");
        nv2.setTuoi("22");
        nv2.setDiaChi("Khanh Hoa");
        nv2.setTienLuong(300);
        nv2.setTongSoGio(150);
        quanLyNhanVien.them(nv2);
        
        //nhan vien 3
        NhanVien nv3 = new NhanVien();
        nv3.setTen("Nguyen Van Hoang");
        nv3.setTuoi("22");
        nv3.setDiaChi("Khanh Hoa");
        nv3.setTienLuong(300);
        nv3.setTongSoGio(300);
        quanLyNhanVien.them(nv3);
        
        //nhan vien 4
        NhanVien nv4 = new NhanVien();
        nv4.setTen("Tran Thi Nhan");
        nv4.setTuoi("22");
        nv4.setDiaChi("Phu Yen");
        nv4.setTienLuong(300);
        nv4.setTongSoGio(300);
        quanLyNhanVien.them(nv4);
        
        //nhan vien 5
        NhanVien nv5 = new NhanVien();
        nv5.setTen("Tran Thi Hong");
        nv5.setTuoi("24");
        nv5.setDiaChi("Phu Yen");
        nv5.setTienLuong(500);
        nv5.setTongSoGio(300);
        quanLyNhanVien.them(nv5);
        
        //in danh sach nhan vien
        quanLyNhanVien.inDS();
    }
    
}
