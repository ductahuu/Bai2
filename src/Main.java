import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            menu();
        }
    }

    private static void menu() {
        QuanLySach qly = new QuanLySach();
        System.out.println("Chương trình quản lý tài liệu");
        System.out.println("1.Thêm mới tài liêu: Sách, tạp chí, báo.");
        System.out.println("2.Xoá tài liệu theo mã tài liệu.");
        System.out.println("3.Hiện thị thông tin về tài liệu.");
        System.out.println("4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.");
        System.out.println("5.Thoát");
        System.out.print("Mời chọn : ");
        Scanner sc = new Scanner(System.in);
        int nhap = sc.nextInt();
        switch (nhap) {
            case 1:
                System.out.println("1.Thêm mới tài liêu: Sách, tạp chí, báo.");
                System.out.println("Chọn 1 : Thêm mới Sách");
                System.out.println("Chọn 2 : Thêm mới tạp chí");
                System.out.println("Chọn 3 : Thêm mới báo");
                System.out.println("Mời bạn chọn : ");
                int nhap1 = sc.nextInt();
                switch (nhap1){
                    case 1 :
                        System.out.println("Thêm Sách");
                        qly.lsSach();
                        break;
                    case 2 :
                        System.out.println("Thêm tạp chí");
                        qly.lsTapChi();
                        break;
                    case 3 :
                        System.out.println("Thêm báo");
                        qly.lsBao();
                        break;
                }
                break;

            case 2 : //đang có vấn đề
                System.out.println("2.Xoá tài liệu theo mã tài liệu.");
                qly.deleteTL();
                break;
            case 3:
                System.out.println("3.Hiện thị thông tin về tài liệu.");
                qly.dsTaiLieu();
                break;

            case 4:
                System.out.println("Tìm tài liệu");
                qly.findSach();
                break;

            case 5:
                System.exit(0);

        }
    }
}
