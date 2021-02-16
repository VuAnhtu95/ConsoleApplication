package Programs;

import Methods.MethodCanBo;
import QuanLy.CanBo;

import java.util.Scanner;

public class Menu {
    static MethodCanBo method = new MethodCanBo();
    public static void main(String[] args) {
        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("------Menu------");
            System.out.println("1: Quản Lý Cán Bộ Nhân Viên ");
            System.out.println("2: Quản Lý Lương ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1->{
                    System.out.println("------Quản Lý Thông Tin Cán Bộ------");
                    System.out.println("1: Thêm Cán Bộ ");
                    System.out.println("2: Hiển Thị Thông Tin Cán Bộ ");
                    int choice1 = Integer.parseInt(scanner.nextLine());
                    switch (choice1){
                        case 1->{
                            CanBo canBo = methods.getInfoCanBo();
                            method.add(canBo);
                        }
                        case 2-> method.show();
                    }
                }
                case 2->{
                    System.out.println("------Quản Lý Lương------");
                    System.out.println("1: Thêm thông tin lương của cán bộ ");
                    System.out.println("2: Hiển thị lương thực lĩnh của cán bộ ");
                    System.out.println("3: Hiển thị các bộ có lương hơn 8 triệu ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    switch (choice2){
                        case 1->{
                            CanBo a = methods.getLuongByName();
                        }
                        case 2->{
                            method.showLuongThucLinh();
                        }
                        case 3->{
                            CanBo b = method.getCanBoByLuong();
                            System.out.println("Cán bộ có lương trên 8 triệu là " + b.getName() + " có lương " + b.getLuongThucLinh());
                        }
                    }
                }
            }
        }while (true);
    }
}
