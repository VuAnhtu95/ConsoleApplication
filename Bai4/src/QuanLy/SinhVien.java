package QuanLy;

public class SinhVien {
    private String name;
    private int idStudent;
    private int ngaySinh;
    private String diaChi;

    public SinhVien(){

    }
    public SinhVien(String name, int idStudent, int ngaySinh, String diaChi) {
        this.name = name;
        this.idStudent = idStudent;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    @Override
    public String toString(){
        return "Sinh viên " + getName()
                + " có mã sinh viên " + getIdStudent()
                + " sinh năm " + getNgaySinh()
                + " địa chỉ " + getDiaChi();
    }
}
