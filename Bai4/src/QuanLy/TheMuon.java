package QuanLy;

import java.util.ArrayList;
import java.util.List;

public class TheMuon {
    private SinhVien sinhVien;
    private int idTheMuon;
    private String ngayMuon;
    private String ngayTraSach;
    private List<Sach> sach ;

    public TheMuon(){

    }
    public TheMuon(SinhVien sinhVien, int idTheMuon, String ngayMuon, String ngayTraSach , List<Sach> sach) {
        this.sinhVien = sinhVien;
        this.idTheMuon = idTheMuon;
        this.ngayMuon = ngayMuon;
        this.ngayTraSach = ngayTraSach;
        this.sach = sach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public int getIdTheMuon() {
        return idTheMuon;
    }

    public void setIdTheMuon(int idTheMuon) {
        this.idTheMuon = idTheMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTraSach() {
        return ngayTraSach;
    }

    public void setNgayTraSach(String ngayTraSach) {
        this.ngayTraSach = ngayTraSach;
    }

    public List<Sach> getSach() {
        return sach;
    }

    public void setSach(List<Sach> sach) {
        this.sach = sach;
    }

    @Override
    public String toString(){
        return  "Số thẻ mượn : " + idTheMuon
                + " Sinh viên " + sinhVien.getName()
                + " có mã sinh viên " + sinhVien.getIdStudent()
                + " Sách mượn gồm những quyển " + sach
                + " số ngày mượn " + ngayMuon
                + " ngày trả " + ngayTraSach;
    }
}
