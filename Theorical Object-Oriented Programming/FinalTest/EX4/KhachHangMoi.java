public class KhachHangMoi extends KhachHang {
    public KhachHangMoi (String maKhachHang, String tenKhachHang, String gioiTinh, String diaChi, int soLuong, double giaBan) {
        super (maKhachHang, tenKhachHang, gioiTinh, diaChi, soLuong, giaBan);
    }
    public double tinhThanhTien () {
        return this.soLuong * this.giaBan;
    }
}