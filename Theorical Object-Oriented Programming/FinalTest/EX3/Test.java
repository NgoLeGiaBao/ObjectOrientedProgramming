public class Test {
    public static void main (String [] args) {
        HoaDon hd = new HoaDon ();
        HoaDonGiaoHang hdgh = new HoaDonGiaoHang();

        System.out.println (hd.tinhThanhTien());
        System.out.println (hd.tinhThue());
        System.out.println (hd.tinhTongTien());

        System.out.println (hdgh.tinhThanhTien());
        System.out.println (hdgh.tinhThue());
        System.out.println (hdgh.tinhTongTien());
    }
}