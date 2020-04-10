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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NhanVien nhanvien = new NhanVien();
        nhanvien.setTen("Nguyen Van Thanh");
        nhanvien.setDiaChi("Khanh Hoa");
        nhanvien.setTuoi("22");
        nhanvien.setTongSoGio(200);
        nhanvien.setTienLuong(200);
        
        //in thong tin nhan vien 
        System.out.println(nhanvien.getThongTin());
        
        //in thong tin luong nhan vien
        System.out.println("Luong nhan vien la :" 
                +nhanvien.tinhThuong());
        
    }
    
}
