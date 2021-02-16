package Programs;

import QuanLy.CanBo;
import Methods.MethodCanBo;
import java.util.Scanner;

public class Methods {
    MethodCanBo methodCanBo = new MethodCanBo();
    Scanner scanner = new Scanner(System.in);
    public CanBo getInfoCanBo(){
        CanBo canBo = new CanBo();
        System.out.println("Nhập tên cán bộ : ");
        String name = scanner.nextLine();
        canBo.setName(name);
        System.out.println("Nhập vào địa chỉ cán bộ : ");
        String address = scanner.nextLine();
        canBo.setAddress(address);
        return canBo;
    }
    public CanBo getLuongByName(){
        System.out.println("Nhập vào tên cán bộ muốn tính lương ");
        String name = scanner.nextLine();
        CanBo a = methodCanBo.getCanBoByName(name);
        System.out.println("Nhập vào lương cứng của cán bộ này :");
        int luongCung = Integer.parseInt(scanner.nextLine());
        a.setLuongCung(luongCung);
        System.out.println("Nhập vào thưởng của cán bộ này :");
        int thuong = Integer.parseInt(scanner.nextLine());
        a.setThuong(thuong);
        System.out.println("Nhập vào phạt của cán bộ này :");
        int phat = Integer.parseInt(scanner.nextLine());
        a.setPhat(phat);
        a.setLuongThucLinh(luongCung,thuong,phat);
        return a;
    }
}
