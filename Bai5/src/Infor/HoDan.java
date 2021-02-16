package Infor;

import java.util.List;

public class HoDan {
    private int id;
    private String diaChi;
    private int soNguoi;
    private List<Nguoi> nguoi;
    public HoDan(){}

    public HoDan(int id, String diaChi, int soNguoi, List<Nguoi> nguoi) {
        this.id = id;
        this.diaChi = diaChi;
        this.soNguoi = soNguoi;
        this.nguoi = nguoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    public List<Nguoi> getNguoi() {
        return nguoi;
    }

    public void setNguoi(List<Nguoi> nguoi) {
        this.nguoi = nguoi;
    }
    @Override
    public String toString(){
        return "Hộ gia đình có " + soNguoi + " gồm những người " + "\n" + nguoi;
    }
}
