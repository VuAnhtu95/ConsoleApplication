package Menu;

import Methods.methodSach;
import Methods.methodStudent;
import QuanLy.Sach;
import QuanLy.SinhVien;
import QuanLy.TheMuon;

import java.util.ArrayList;
import java.util.Scanner;

public class method {
    Scanner scanner = new Scanner(System.in);
    public SinhVien getInfoStudent(){
        SinhVien sinhVien = new SinhVien();
        System.out.println("Nhập vào tên sinh viên : ");
        String name = scanner.nextLine();
        sinhVien.setName(name);
        System.out.println("Nhập mã sinh viên : ");
        int id = Integer.parseInt(scanner.nextLine());
        sinhVien.setIdStudent(id);
        System.out.println("Nhập năm sinh : ");
        int number = Integer.parseInt(scanner.nextLine());
        sinhVien.setNgaySinh(number);
        System.out.println("Nhập địa chỉ sinh viên : ");
        String address = scanner.nextLine();
        sinhVien.setDiaChi(address);
        return sinhVien;
    }
    public Sach getInfoSach(){
        Sach sach = new Sach();
        System.out.println("Nhập vào tên sách : ");
        String name = scanner.nextLine();
        sach.setNameSach(name);
        System.out.println("Nhập vào code quyển sách ");
        int code = Integer.parseInt(scanner.nextLine());
        sach.setCodeSach(code);
        return sach;
    }
    public int getCodeSach(){
        System.out.println("Nhập vào code sách muốn xóa ");
        int code = Integer.parseInt(scanner.nextLine());
        return code;
    }
    public TheMuon getInfoTheMuon(){
        TheMuon theMuon = new TheMuon();
        ArrayList<Sach> sachs = new ArrayList<>();
        SinhVien s = new SinhVien();
        System.out.println("Nhập vào id thẻ mượn ");
        theMuon.setIdTheMuon(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào id sinh viên mượn ");
        int id = Integer.parseInt(scanner.nextLine());
        s = methodStudent.getSinhVienbyId(id);
        theMuon.setSinhVien(s);
        System.out.println("Muốn mượn bao nhiêu quyển ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập vào id quyển sách bạn muốn mượn ");
            int idSach = Integer.parseInt(scanner.nextLine());
            Sach a = methodSach.getSachbyCode(idSach);
            sachs.add(a);
        }
        theMuon.setSach(sachs);
        System.out.println("Nhập ngày mượn : ");
        String ngayMuon = scanner.nextLine();
        theMuon.setNgayMuon(ngayMuon);
        System.out.println("Khi nào trả ? ");
        String ngayTra = scanner.nextLine();
        theMuon.setNgayTraSach(ngayTra);
        return theMuon;
    }
}
