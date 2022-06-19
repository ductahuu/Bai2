import java.util.Date;
import java.util.Scanner;

public class TaiLieu {
    protected String maTaiLieu;
    protected String tenXuatBan;
    protected int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenXuatBan, int soBan) {
        this.maTaiLieu = maTaiLieu;
        this.tenXuatBan = tenXuatBan;
        this.soBan = soBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenXuatBan() {
        return tenXuatBan;
    }

    public void setTenXuatBan(String tenXuatBan) {
        this.tenXuatBan = tenXuatBan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenXuatBan='" + tenXuatBan + '\'' +
                ", soBan=" + soBan +
                '}';
    }

    public void nhapSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mã tài liệu : ");
        String maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên xuất bản :");
        String tenXuatBan = sc.nextLine();
        System.out.print("Nhập số bản : ");
        int soBan = sc.nextInt();
        System.out.print("Enter tên tác giả : ");
        sc.nextLine();
        String tenTacGia = sc.nextLine();
        System.out.print("Nhập số trang : ");
        int soTrang = sc.nextInt();
    }

    public void nhapTapChi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mã tài liệu : ");
        String maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên xuất bản :");
        String tenXuatBan = sc.nextLine();
        System.out.print("Nhập số bản : ");
        int soBan = sc.nextInt();
        System.out.print("Nhập số phát hành : ");
        sc.nextLine();
        int soPhatHanh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập tháng phát hành : ");
        int thangPhatHanh = sc.nextInt();
    }

    public void nhapBao(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mã tài liệu : ");
        String maTaiLieu = sc.nextLine();
        System.out.print("Nhập tên xuất bản :");
        String tenXuatBan = sc.nextLine();
        System.out.print("Nhập số bản : ");
        int soBan = sc.nextInt();
        System.out.print("Nhập ngày phát hành : ");
        sc.nextLine();
        String ngayPhatHanh = sc.nextLine();
    }



}
