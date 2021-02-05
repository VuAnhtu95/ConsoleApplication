package Methods;

import QuanLy.SinhVien;

import java.util.ArrayList;


public class methodStudent {
    static ArrayList<SinhVien>  sinhViens = new ArrayList<>();;

    public void add(SinhVien sinhVien){
        sinhViens.add(sinhVien);
    }
    public void show(){
        for (SinhVien i:sinhViens) {
            System.out.println(i.toString());
        }
    }

    public static SinhVien getSinhVienbyId(int id){
        SinhVien sinhVien = null;
        for (SinhVien sinhVien1:sinhViens) {
            if (sinhVien1.getIdStudent() == id ){
                sinhVien = sinhVien1;
            }
        }
        return sinhVien;
    }
}
