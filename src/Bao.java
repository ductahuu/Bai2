import java.util.Date;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(String maTaiLieu, String tenXuatBan, int soBan, String ngayPhatHanh) {
        super(maTaiLieu, tenXuatBan, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenXuatBan='" + tenXuatBan + '\'' +
                ", soBan=" + soBan +
                '}';
    }
}
