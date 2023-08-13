public class HoaDon {
    protected String maHoaDon;
    protected String ngayLapHoaDon;
    protected String nguoiBan;
    protected String nguoiMua;
    protected int soLuong;
    protected double donGian;
    protected String tenSanPham;

    public HoaDon () {
        this.maHoaDon = "HD001";
        this.nguoiBan = "Nguyen Hoang";
        this.nguoiMua = "Gia Bao";
        this.tenSanPham = "But bi Thien Long";
        this.soLuong = 20;
        this.donGian = 2500;
    }

    public double tinhThanhTien () {
        if (this.soLuong > 1000) {
            return this.soLuong * this.donGian * 0.96;
        }
        return this.soLuong * this.donGian;
    }
    
    public double tinhThue () {
        return this.tinhThanhTien() * 0.1;
    }
    public double tinhTongTien () {
        return this.tinhThanhTien() + this.tinhThue();
    }
    public String xuatThongTin () {
        return this.maHoaDon + ", "  + this.tenSanPham + ", " + this.nguoiMua + ", " + this.nguoiBan + ", " + this.tinhThanhTien() + ", " + this.tinhThue() + "," + this.tinhTongTien();
    }
}