import java.util.*;
import java.io.*;

public class QuanLyTaiKhoan{
    private ArrayList<TaiKhoan> tkList;

    public QuanLyTaiKhoan(String path){
        this.tkList = docDanhSachTaiKhoan(path);
    }

    public ArrayList<TaiKhoan> docDanhSachTaiKhoan(String path){
        ArrayList<TaiKhoan> temp = new ArrayList<TaiKhoan>();
        try {
            String data = "";
            String [] dataArr;
            File fr = new File (path);
            Scanner rd = new Scanner(fr);
            while (rd.hasNextLine()) {
                data = rd.nextLine();
                dataArr = data.split(",");
                int len = dataArr.length;
                if (len == 3) {
                    temp.add(new TaiKhoan (dataArr[0], dataArr[1], dataArr[2]));
                } else if (len == 4) {
                    temp.add(new TaiKhoanVIP (dataArr[0], dataArr[1], dataArr[2], Integer.parseInt(dataArr[3])));
                }
            }
        } catch (IOException e) {}
        return temp;
    }
    public TaiKhoan dangNhap(String tenDangNhap, String matKhau) {
        for (TaiKhoan tk : tkList) {
            if (tenDangNhap.equals(tk.getTenDangNhap()) && tk.kiemTraDangNhap(matKhau)) {
                return tk;
            }
        }
        return null;
    }

}
