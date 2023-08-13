public class TaiKhoan{
    private String tenDangNhap;
    private String matKhau;
    private String ngayTao;

    public TaiKhoan(String tenDangNhap, String matKhau, String ngayTao){
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.ngayTao = ngayTao;
    }

    public boolean doiMatKhau(String matKhauCu, String matKhauMoi){
        if (matKhauCu.equals(matKhauMoi)) {
            return false;
        } else {
            this.matKhau = matKhauMoi;
        }
        return true;
    }

    public boolean kiemTraDangNhap(String matKhau){
        return this.matKhau.equals(matKhau);
    }

    public String getTenDangNhap(){
        return this.tenDangNhap;
    }

    public String toString(){
        return this.tenDangNhap + " - " + this.matKhau;
    }
}