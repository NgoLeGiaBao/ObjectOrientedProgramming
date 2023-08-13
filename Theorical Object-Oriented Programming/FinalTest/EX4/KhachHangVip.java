public class KhachHangVip extends KhachHang implements ChietKhau {
    private String loaiVIP;
    public KhachHangVip (String maKhachHang, String tenKhachHang, String gioiTinh, String diaChi, int soLuong, double giaBan, String loaiVIP) {
        super (maKhachHang, tenKhachHang, gioiTinh, diaChi, soLuong, giaBan);
        this.loaiVIP = loaiVIP;
    }
    public double tinhThanhTien () {
        return this.soLuong * this.giaBan * 0.9;
    }
    public double tinhChietKhau() {
        return this.tinhThanhTien() * 0.07;
    }
}