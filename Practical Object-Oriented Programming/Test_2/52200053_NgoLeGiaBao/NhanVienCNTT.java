public class NhanVienCNTT extends NhanVien {
    private String viTri;
    private int soNamKinhNghiem;
    public NhanVienCNTT (String maNV, String tenNV, double heSoLuong, int luongCoBan, String viTri, int soNamKinhNghiem) {
        super(maNV, tenNV, heSoLuong, luongCoBan);
        this.viTri = viTri;
        this.soNamKinhNghiem = soNamKinhNghiem;
    }
    public int tienThuongThem () {
        if (this.viTri.equals("Nhan Vien Van Hanh") ||this.viTri.equals("Nhan Vien Quan Tri Mang")) {
            if (soNamKinhNghiem > 3) {
                return (int)(3000000 * 1.1);
            }
            return 3000000;
        }
        return 0;
    }
    public int tinhTongLuong (int soNgayNghi){
        return super.tinhTongLuong(soNgayNghi) + this.tienThuongThem();
    }
}
