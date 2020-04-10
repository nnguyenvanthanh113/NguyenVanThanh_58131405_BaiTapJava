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
        
        //khoi tao 3 chuyen xe noi thanh
        
        //xe noi thanh 1
        XeNoiThanh xeNoiThanh1 = new XeNoiThanh();
        xeNoiThanh1.setMaSoChuyen("XeNoiThanh001");
        xeNoiThanh1.setHoTenTaiXe("Nguyễn Văn Thành");
        xeNoiThanh1.setSoXe("XNT001");
        xeNoiThanh1.setSoTuyen("1");
        xeNoiThanh1.setSoKm("100");
        xeNoiThanh1.setDoanhThu("1000000");
        
        //xe noi thanh 2
        XeNoiThanh xeNoiThanh2 = new XeNoiThanh();
        xeNoiThanh2.setMaSoChuyen("XeNoiThanh002");
        xeNoiThanh2.setHoTenTaiXe("Nguyễn Văn Thưởng");
        xeNoiThanh2.setSoXe("XNT002");
        xeNoiThanh2.setSoTuyen("2");
        xeNoiThanh2.setSoKm("100");
        xeNoiThanh2.setDoanhThu("2000000");
        
        //xe noi thanh 3
        XeNoiThanh xeNoiThanh3 = new XeNoiThanh();
        xeNoiThanh3.setMaSoChuyen("XeNoiThanh003");
        xeNoiThanh3.setHoTenTaiXe("Nguyễn Văn Hoàng");
        xeNoiThanh3.setSoXe("XNT003");
        xeNoiThanh3.setSoTuyen("3");
        xeNoiThanh3.setSoKm("100");
        xeNoiThanh3.setDoanhThu("3000000");
    }
    
}
