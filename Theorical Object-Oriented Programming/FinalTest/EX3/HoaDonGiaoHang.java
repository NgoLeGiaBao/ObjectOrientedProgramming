public class HoaDonGiaoHang extends HoaDon {
    private String diaChi;
    private double khoangCach;
    private double thoiGianGiaoHang;

    public HoaDonGiaoHang () {
        super ();
        this.diaChi = "Q.TanPhu";
        this.khoangCach = 20;
        this.thoiGianGiaoHang = 24;
    }

    public double tinhPhiGiaoHang () {
        if (this.thoiGianGiaoHang < 24) {
            if (this.khoangCach < 10) {
                return 20 * this.khoangCach * this.soLuong;
            }
            return 18 * this.khoangCach * this.soLuong;
        }
        return 150000;
    }
    public double tinhThanhTien () {
        return super.tinhThanhTien() + tinhPhiGiaoHang();
    }
    public String xuatThongTin () {
        return super.xuatThongTin() + ", " + this.tinhPhiGiaoHang();
    }
}