package Menu;

import Methods.methodSach;
import Methods.methodStudent;
import Methods.methodTheMuon;
import QuanLy.Sach;
import QuanLy.SinhVien;
import QuanLy.TheMuon;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {
         methodSach ms = new methodSach();
         methodStudent mst = new methodStudent();
         methodTheMuon mtm = new methodTheMuon();
        method method = new method();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------Menu------");
            System.out.println("1: Quản Lý Sinh Viên ");
            System.out.println("2: Quản Lý Sách ");
            System.out.println("3: Quản Lý Thẻ Mượn ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1->{
                    System.out.println("------Quản lý Sinh Viên------");
                    System.out.println("1: Thêm sinh viên ");
                    System.out.println("2: Hiển thị sinh viên ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1->{
                            SinhVien sinhVien = method.getInfoStudent();
                            mst.add(sinhVien);
                            break;
                        }
                        case 2->{
                            mst.show();
                            break;
                        }
                    }
                }
                case 2->{
                    System.out.println("------Quản lý Sách------");
                    System.out.println("1: Thêm sách ");
                    System.out.println("2: Vứt sách ");
                    System.out.println("3: Hiển thị sách ");
                    int choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3){
                        case 1->{
                            Sach sach = method.getInfoSach();
                            ms.add(sach);
                            break;
                        }
                        case 2->{
                            int code = method.getCodeSach();
                            ms.remove(code);
                            break;
                        }
                        case 3->{
                            ms.show();
                            break;
                        }
                    }
                }
                case 3->{
                    System.out.println("------Quản lý thẻ mượn------");
                    System.out.println("1: Thêm thẻ mượn ");
                    System.out.println("2: Xóa  thẻ mượn ");
                    System.out.println("3: Hiển thị thẻ mượn ");
                    int choice4 = Integer.parseInt(scanner.nextLine());
                    switch (choice4){
                        case 1->{
                            TheMuon theMuon = method.getInfoTheMuon();
                            mtm.add(theMuon);
                            break;
                        }
                        case 2->{
                            break;
                        }
                        case 3->{
                            mtm.show();
                        }
                    }
                }
            }
        }while (true);
    }
}
