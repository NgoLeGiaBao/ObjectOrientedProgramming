public class KhachHangThanThiet extends KhachHang implements ChietKhau {
    private double tongTien;
    public KhachHangThanThiet (String maKhachHang, String tenKhachHang, String gioiTinh, String diaChi, int soLuong, double giaBan, double tongTien) {
        super (maKhachHang, tenKhachHang, gioiTinh, diaChi, soLuong, giaBan);
        this.tongTien = tongTien;
    }
    public double tinhThanhTien () {
        return (this.soLuong - (this.soLuong /30)) * this.giaBan;
    }
    public double tinhChietKhau () {
        return this.tinhThanhTien() * 0.05;    
    }
}