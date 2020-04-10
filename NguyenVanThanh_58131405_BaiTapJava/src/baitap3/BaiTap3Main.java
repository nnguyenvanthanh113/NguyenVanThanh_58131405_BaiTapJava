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
public class BaiTap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //sinh vien IT
        SinhVienIT sinhVienIT = new SinhVienIT(8, 6, 9, "Nguyễn Văn Thành", "Công Nghệ Thông Tin");
        System.out.println("Họ tên :"+sinhVienIT.getHoTen() + " "
                            + "Ngành học :" + sinhVienIT.getNganh() + " "
                            + "Điểm :" + sinhVienIT.getDiem() + " "
                            + "Học lực :" + sinhVienIT.getHocLuc());
        
        //sinh vien Biz
        SinhVienBiz sinhVienBiz = new SinhVienBiz(8, 7, "nguyễn Thị Thu", "Kinh Tế");
         System.out.println("Họ tên :"+sinhVienBiz.getHoTen() + " "
                            + "Ngành học :" + sinhVienBiz.getNganh() + " "
                            + "Điểm :" + sinhVienBiz.getDiem() + " "
                            + "Học lực :" + sinhVienBiz.getHocLuc());
        

         //sinh vien Poly
        SinhVienPoly sinhVienPoly = new SinhVienPoly("Trần Thị Hiền", "Thương Mại") {
            @Override
            public double getDiem() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return 5;
            }
        };
        System.out.println("Họ tên :"+sinhVienPoly.getHoTen() + " "
                            + "Ngành học :" + sinhVienPoly.getNganh() + " "
                            + "Điểm :" + sinhVienPoly.getDiem() + " "
                            + "Học lực :" + sinhVienPoly.getHocLuc());
    }
    
}
