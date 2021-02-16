package Program;

import Infor.HoDan;
import Infor.KhuPho;
import Infor.Nguoi;
import Methods.MethodHoDan;
import Methods.MethodKhuPho;
import Methods.MethodNguoi;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        MethodKhuPho methodKhuPho = new MethodKhuPho();
        MethodNguoi mtn = new MethodNguoi();
        MethodHoDan methodHoDan = new MethodHoDan();
        Method method = new Method();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("------Menu------");
            System.out.println("1: Quản Lý Người ");
            System.out.println("2: Quản Lý Hộ Dân ");
            System.out.println("3: Quản Lý Khu Phố ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1->{
                    System.out.println("------Quản Lý Người------");
                    System.out.println("1: Thêm Người ");
                    System.out.println("2: Xóa Người ");
                    System.out.println("3: Sửa Người ");
                    System.out.println("4: Hiển Thị Thông Tin ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1->{
                            Nguoi nguoi = method.getInforNguoi();
                            mtn.add(nguoi);
                        }
                        case 4-> mtn.show();
                    }
                }
                case 2->{
                    System.out.println("------Quản Lý Hộ Dân------");
                    System.out.println("1: Thêm Hộ Dân ");
                    System.out.println("2: Xóa Hộ Dân ");
                    System.out.println("3: Hiển Thị Thông Tin Hộ Dân ");
                    int choice3 = Integer.parseInt(scanner.nextLine());
                    switch (choice3){
                        case 1->{
                            HoDan hoDan = method.getInforHoDan();
                            methodHoDan.add(hoDan);
                        }
                        case 3-> methodHoDan.show();
                    }
                }
                case 3->{
                    System.out.println("------Quản Lý Khu Phố------");
                    System.out.println("1: Thêm Khu Phố ");
                    System.out.println("2: Hiển Thị Thông Tin Khu Phố ");
                    int choice4 = Integer.parseInt(scanner.nextLine());
                    switch (choice4){
                        case 1->{
                            KhuPho khuPho = method.getInforKhuPho();
                            methodKhuPho.add(khuPho);
                        }
                        case 2-> methodKhuPho.show();
                    }
                }
            }
        }while (true);
    }
}
