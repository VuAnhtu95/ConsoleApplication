package Infor;

public class Nguoi {
    private int id;
    private String hoTen;
    private String ngaySinh;
    private String ngheNghiep;

    public Nguoi(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Nguoi(String hoTen, String ngaySinh, String ngheNghiep) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }
    @Override
    public String toString(){
        return " Người tên " + hoTen + " sinh ngày " + ngaySinh + " nghề nghiệp là " + ngheNghiep ;
    }
}
