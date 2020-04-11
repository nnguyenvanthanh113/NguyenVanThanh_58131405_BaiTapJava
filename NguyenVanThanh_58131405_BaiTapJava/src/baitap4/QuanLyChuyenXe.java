/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

import java.util.ArrayList;

/**
 *
 * @author ThanhMickey
 */
public class QuanLyChuyenXe {
   
    ArrayList<XeNoiThanh> xeNoiThanhs = new ArrayList();
    ArrayList<XeNgoaiThanh> xeNgoaiThanhs = new ArrayList();
    
    //them xe noi thanh
    public void ThemChuyenXeNoiThanh(XeNoiThanh xeNoiThanh){
        xeNoiThanhs.add(xeNoiThanh);
    }
    
    //them xe ngoai thanh
    public void ThemChuyenXeNgoaiThanh(XeNgoaiThanh xeNgoaiThanh)
    {
        xeNgoaiThanhs.add(xeNgoaiThanh);
    }
    
    public void XuatDSCX(){
        
        //xuat danh sach xe noi thanh
        for(int i = 0; i < xeNoiThanhs.size(); i++)
        {
            System.out.println("xe noi thanh " + (i+1) + " "
                            + xeNoiThanhs.get(i).getMaSoChuyen());
               
        }
        
        //xuat danh sach xe ngoai thanh
        for(int i = 0; i < xeNgoaiThanhs.size(); i++)
        {
            System.out.println("xe ngoai thanh " + (i+1) + " "
                            + xeNgoaiThanhs.get(i).getMaSoChuyen());
               
        }
    }
    public void InThongTinTungChuyenXe(){
        
        //in thong tin xe noi thanh
        for(int i = 0; i < xeNoiThanhs.size(); i++)
        {
            System.out.println("chuyen xe noi thanh " + (i+1) + " "
                + "ma chuyen xe :" + xeNoiThanhs.get(i).getMaSoChuyen() + " "
                + "ho ten tai xe :" + xeNoiThanhs.get(i).getHoTenTaiXe() + " "
                + "so xe :" + xeNoiThanhs.get(i).getSoXe() + " "
                + "so tuyen :" + xeNoiThanhs.get(i).getSoTuyen() + " "
                + "so km :" + xeNoiThanhs.get(i).getSoKm() + " "
                + "doanh thu :" + xeNoiThanhs.get(i).getDoanhThu());
        }
        
        //in thong tin xe ngoai thanh
        for(int i = 0; i < xeNgoaiThanhs.size(); i++)
        {
            System.out.println("chuyen xe ngoai thanh " + (i+1) + " "
                + "ma chuyen xe :" + xeNgoaiThanhs.get(i).getMaSoChuyen() + " "
                + "ho ten tai xe :" + xeNgoaiThanhs.get(i).getHoTenTaiXe() + " "
                + "so xe :" + xeNgoaiThanhs.get(i).getSoXe() + " "
                + "noi den :" + xeNgoaiThanhs.get(i).getNoiDen() + " "
                + "so ngay di :" + xeNgoaiThanhs.get(i).getSoNgayDi() + " "
                + "doanh thu :" + xeNgoaiThanhs.get(i).getDoanhThu());
        }
        
    }
    public float TongDoanhThuXeNoiThanh(){
       
        float TongXeNoiThanh = 0;
        for(int i = 0; i < xeNoiThanhs.size(); i++)
        {
            if(xeNoiThanhs.get(i) instanceof XeNoiThanh)
            {
                TongXeNoiThanh += xeNoiThanhs.get(i).getDoanhThu();
            }
        }
        return TongXeNoiThanh;
    }
    public float TongDoanhThuXeNgoaiThanh(){
        
        float TongXeNgoaiThanh = 0;
        for(int i = 0; i < xeNgoaiThanhs.size(); i++)
        {
                TongXeNgoaiThanh += xeNgoaiThanhs.get(i).getDoanhThu();
        }
        return TongXeNgoaiThanh;
    }
    public float TongDoanhThu(){
        float TongDoanhThu = 0;
        for(int i = 0; i < xeNoiThanhs.size(); i++)
        {
            TongDoanhThu += xeNoiThanhs.get(i).getDoanhThu();
        }
        for(int i = 0; i < xeNgoaiThanhs.size(); i++)
        {
            TongDoanhThu += xeNgoaiThanhs.get(i).getDoanhThu();
        }
        return TongDoanhThu;
    }
}
