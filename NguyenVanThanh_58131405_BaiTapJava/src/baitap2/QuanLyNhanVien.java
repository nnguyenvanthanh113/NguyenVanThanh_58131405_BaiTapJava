/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.ArrayList;

/**
 *
 * @author ThanhMickey
 */
public class QuanLyNhanVien implements IQuanLy{

    ArrayList<NhanVien> nhanvien = new ArrayList<>();
    
    @Override
    public void them(NhanVien nv) {
        nhanvien.add(nv);
    }

    @Override
    public void inDS() {
        for(int i=0; i<nhanvien.size();i++)
        {
            System.out.println("Nhân viên "+ (i+1));
            System.out.println(nhanvien.get(i).getTen()+ " " 
                    +nhanvien.get(i).getTuoi() + " "
                    +nhanvien.get(i).getDiaChi() + " " 
                    +nhanvien.get(i).getTienLuong() + " " 
                    +nhanvien.get(i).getTongSoGio());
        }
    }
    
}
