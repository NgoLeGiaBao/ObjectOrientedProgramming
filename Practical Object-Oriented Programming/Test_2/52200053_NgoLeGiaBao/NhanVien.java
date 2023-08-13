public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected double heSoLuong;
    protected int luongCoBan;

    public NhanVien (String maNV, String tenNV, double heSoLuong, int luongCoBan) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }
    public int luongCoDinh (int soNgayNghi) {
        return (int)(this.luongCoBan * this.heSoLuong);
    }
    public abstract int tienThuongThem ();
    public int tinhTongLuong (int soNgayNghi) {
        if (soNgayNghi == 0) {
            return this.luongCoDinh(soNgayNghi) + 500000;
        } 
        return this.luongCoDinh(soNgayNghi);
    }
}