import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    static ArrayList<TaiLieu> ls = new ArrayList<>();
     TaiLieu tl = new TaiLieu();

    public void lsSach(){
        TaiLieu taiLieu = new TaiLieu();
        taiLieu.nhapSach();
        ls.add(taiLieu);
    }

    public void lsTapChi(){
        TaiLieu taiLieu = new TaiLieu();
        taiLieu.nhapTapChi();
        ls.add(taiLieu);
    }

    public void lsBao(){
        TaiLieu taiLieu = new TaiLieu();
        taiLieu.nhapBao();
        ls.add(taiLieu);
    }


    public void deleteTL() {
        Scanner sc = new Scanner(System.in);
        String nhap = sc.nextLine();
        if (ls.isEmpty()){
            System.out.println("Null");
            return;
        }
        for (int i = 0; i < ls.size(); i++) {
            if (nhap.equalsIgnoreCase(ls.get(i).getMaTaiLieu())){
                System.out.println("Đã tìm thấy tài liệu có mã : "+nhap);
                ls.remove(nhap);
                System.out.println("Xóa thành công");
                return;
            }
        }
        System.out.println("Không tìm thây mã : "+nhap);
    }

    public void dsTaiLieu(){
        if (ls.isEmpty()){
            System.out.println("Danh sách null");
            return;
        }
        for (TaiLieu tl : ls) {
            tl.toString();
        }
    }

    public void findSach(){
        System.out.println("Nhập mã sv muốn tìm");
        Scanner sc = new Scanner(System.in);
        String nhap = sc.nextLine();
        if (ls.isEmpty()){
            System.out.println("Dsach đang null");
            return;
        }
        for (TaiLieu x : ls) {
            //neu nguoi dung nhap vao trung voi maSV thi in ra kqua
            if (nhap.equalsIgnoreCase(x.getMaTaiLieu())){
                System.out.println("Da tim thay tài liệu có mã : "+nhap);
                x.toString();
                return;
            }
        }
        System.out.println("Khong tim thay : "+nhap);
    }
}
