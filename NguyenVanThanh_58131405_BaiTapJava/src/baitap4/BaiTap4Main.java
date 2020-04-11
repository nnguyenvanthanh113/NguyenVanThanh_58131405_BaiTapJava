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
public class BaiTap4Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe();
        
        
        //khoi tao 3 chuyen xe noi thanh
        
        //xe noi thanh 1
        XeNoiThanh xeNoiThanh1 = new XeNoiThanh();
        xeNoiThanh1.setMaSoChuyen("XeNoiThanh001");
        xeNoiThanh1.setHoTenTaiXe("Nguyễn Văn Thành");
        xeNoiThanh1.setSoXe("XNT001");
        xeNoiThanh1.setSoTuyen("1");
        xeNoiThanh1.setSoKm("100");
        xeNoiThanh1.setDoanhThu(1000000f);
        
        //them xe noi thanh 1
        quanLyChuyenXe.ThemChuyenXeNoiThanh(xeNoiThanh1);
        
        //xe noi thanh 2
        XeNoiThanh xeNoiThanh2 = new XeNoiThanh();
        xeNoiThanh2.setMaSoChuyen("XeNoiThanh002");
        xeNoiThanh2.setHoTenTaiXe("Nguyễn Văn Thưởng");
        xeNoiThanh2.setSoXe("XNT002");
        xeNoiThanh2.setSoTuyen("2");
        xeNoiThanh2.setSoKm("100");
        xeNoiThanh2.setDoanhThu(2000000f);
        
        //them xe noi thanh 2
        quanLyChuyenXe.ThemChuyenXeNoiThanh(xeNoiThanh2);
        
        //xe noi thanh 3
        XeNoiThanh xeNoiThanh3 = new XeNoiThanh();
        xeNoiThanh3.setMaSoChuyen("XeNoiThanh003");
        xeNoiThanh3.setHoTenTaiXe("Nguyễn Văn Hoàng");
        xeNoiThanh3.setSoXe("XNT003");
        xeNoiThanh3.setSoTuyen("3");
        xeNoiThanh3.setSoKm("100");
        xeNoiThanh3.setDoanhThu(3000000f);
        
        //them xe noi thanh 3
        quanLyChuyenXe.ThemChuyenXeNoiThanh(xeNoiThanh3);
        
        
        //khoi tao 3 chuyen xe ngoai thanh
        
        //xe ngoai thanh 1
        XeNgoaiThanh xeNgoaiThanh1 = new XeNgoaiThanh();
        xeNgoaiThanh1.setMaSoChuyen("XeNgoaiThanh001");
        xeNgoaiThanh1.setHoTenTaiXe("Cao Thi Tan");
        xeNgoaiThanh1.setSoXe("79-N001");
        xeNgoaiThanh1.setNoiDen("Nha Trang");
        xeNgoaiThanh1.setSoNgayDi("3");
        xeNgoaiThanh1.setDoanhThu(20000f);
        
        //them xe ngoai thanh 1
        quanLyChuyenXe.ThemChuyenXeNgoaiThanh(xeNgoaiThanh1);
        
        //xe ngoai thanh 2
        XeNgoaiThanh xeNgoaiThanh2 = new XeNgoaiThanh();
        xeNgoaiThanh2.setMaSoChuyen("XeNgoaiThanh002");
        xeNgoaiThanh2.setHoTenTaiXe("Nguyen Cuong");
        xeNgoaiThanh2.setSoXe("79-N002");
        xeNgoaiThanh2.setNoiDen("Nha Trang");
        xeNgoaiThanh2.setSoNgayDi("3");
        xeNgoaiThanh2.setDoanhThu(50000f);
        
        //them xe ngoai thanh 2
        quanLyChuyenXe.ThemChuyenXeNgoaiThanh(xeNgoaiThanh2);
        
        //xe ngoai thanh 3
        XeNgoaiThanh xeNgoaiThanh3 = new XeNgoaiThanh();
        xeNgoaiThanh3.setMaSoChuyen("XeNgoaiThanh003");
        xeNgoaiThanh3.setHoTenTaiXe("Nguyen Thi Huong");
        xeNgoaiThanh3.setSoXe("79-N003");
        xeNgoaiThanh3.setNoiDen("Nha Trang");
        xeNgoaiThanh3.setSoNgayDi("3");
        xeNgoaiThanh3.setDoanhThu(60000f);
        
        //them xe ngoai thanh 3
        quanLyChuyenXe.ThemChuyenXeNgoaiThanh(xeNgoaiThanh3);
        
        //XuatDSCX
        System.out.println("--------Xuat DSCX ----------");
        quanLyChuyenXe.XuatDSCX();
        
        
        // In thong tin tung chuyen xe
        System.out.println("--------In thong tin tung chuyen xe ----------");
        quanLyChuyenXe.InThongTinTungChuyenXe();
    
        
        //In tong doanh thu
        System.out.println("-----------Tong doanh thu--------");
        System.out.println(quanLyChuyenXe.TongDoanhThu());
        
        //doanh thu xe noi thanh
        System.out.println("-----------Doanh thu xe noi thanh--------");
        System.out.println(quanLyChuyenXe.TongDoanhThuXeNoiThanh());
        
        
        //doanh thu xe ngoai thanh
        System.out.println("-----------Doanh thu xe ngoai thanh--------");
        System.out.println(quanLyChuyenXe.TongDoanhThuXeNgoaiThanh());
    }
    
}
