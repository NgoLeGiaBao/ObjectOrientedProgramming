public class TestNV {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVienCNTT("N1", "Alex", 1.5, 2000000, "Nhan Vien Van Hanh", 5);
        System.out.println(nv1.tinhTongLuong(0));
        NhanVien nv2 = new NhanVienKinhDoanh("N2", "Tom", 2.0, 2000000, "Bat Dong San", 10);
        System.out.println(nv2.tinhTongLuong(0));
        NhanVien nv3 = new NhanVienKinhDoanh("N3", "Jerry", 1.5, 2000000, "Phan Phoi Le", 50);
        System.out.println(nv3.tinhTongLuong(2));
        NhanVien nv4 = new NhanVienKinhDoanh("N3", "Jerry", 1.5, 2000000, "Phan Phoi Le", 50);
        System.out.println(nv4.tinhTongLuong(0));
        System.out.println(nv4.luongCoDinh(0));
    }
}