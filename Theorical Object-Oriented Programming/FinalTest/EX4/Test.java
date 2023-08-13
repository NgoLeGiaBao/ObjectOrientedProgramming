import java.util.*;
public class Test {
    public static void main (String [] args) {
        ArrayList <KhachHang> dsKhachHang = new ArrayList <KhachHang> ();
        KhachHang kh1 = new KhachHangMoi ("","","","", 31,2500);
        KhachHangThanThiet kh2 = new KhachHangThanThiet ("","","","", 31,2500,1000);
        KhachHangVip kh3 = new KhachHangVip ("","","","", 31,2500,"1000");

        dsKhachHang.add(kh1);
        dsKhachHang.add(kh2);
        dsKhachHang.add(kh3);
        
        int i = 0;
        for (KhachHang kh : dsKhachHang) {
            System.out.println (i++);
            if (kh instanceof KhachHangThanThiet || kh instanceof KhachHangVip) {
                // System.out.println (kh.tinhChietKhau());
            }
            System.out.println (kh.tinhThanhTien()) ;
        }
        System.out.println (kh2.tinhChietKhau());
        System.out.println (kh3.tinhChietKhau());
    }
}