public abstract class KhachHang {
    protected String maKhachHang;
    protected String tenKhachHang;
    protected String gioiTinh;
    protected String diaChi;
    protected int soLuong;
    protected double giaBan;

    public KhachHang (String maKhachHang, String tenKhachHang, String gioiTinh, String diaChi, int soLuong, double giaBan) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }
    public abstract double tinhThanhTien ();
}