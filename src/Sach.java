public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenXuatBan, int soBan, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenXuatBan, soBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", tenXuatBan='" + tenXuatBan + '\'' +
                ", soBan=" + soBan +
                '}';
    }
}

