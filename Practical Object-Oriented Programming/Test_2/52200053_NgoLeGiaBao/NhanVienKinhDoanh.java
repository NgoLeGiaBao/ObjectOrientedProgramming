public class NhanVienKinhDoanh extends NhanVien {
    private String linhVucHoatDong;
    private int tongSoHopDong;
    public NhanVienKinhDoanh (String maNV, String tenNV, double heSoLuong, int luongCoBan, String linhVucHoatDong, int tongSoHopDong) {
        super(maNV, tenNV, heSoLuong, luongCoBan);
        this.linhVucHoatDong = linhVucHoatDong;
        this.tongSoHopDong = tongSoHopDong;
    }
    public int tienThuongThem () {
        if (this.linhVucHoatDong.equals("Bat Dong San") ||this.linhVucHoatDong.equals("Bao Hiem")) {
            if (this.tongSoHopDong > 30) {
                return 2000000 + (300000 * this.tongSoHopDong);
            } 
            return 2000000;
            
        }
        else {
            if (this.tongSoHopDong > 30) {
                return 1000000 + (300000 * this.tongSoHopDong);
            } 
            return 1000000;
        }
        
    }
    public int tinhTongLuong (int soNgayNghi){
        return super.tinhTongLuong(soNgayNghi) + this.tienThuongThem();
    }
}
 