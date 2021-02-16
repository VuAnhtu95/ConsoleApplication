package Program;

import Infor.HoDan;
import Infor.KhuPho;
import Infor.Nguoi;
import Methods.MethodHoDan;
import Methods.MethodNguoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Method {
    Scanner scanner = new Scanner(System.in);
    public Nguoi getInforNguoi(){
        Nguoi nguoi = new Nguoi();
        System.out.println("Nhập vào tên người : ");
        String name = scanner.nextLine();
        nguoi.setHoTen(name);
        System.out.println("Nhập vào ngày sinh ");
        String date = scanner.nextLine();
        nguoi.setNgaySinh(date);
        System.out.println("Nhập vào nghề nghiệp của người này : ");
        String jobs = scanner.nextLine();
        nguoi.setNgheNghiep(jobs);
        return nguoi;
    }
    public HoDan getInforHoDan(){
        List<Nguoi> nguoi = new ArrayList<>();
        HoDan hoDan = new HoDan();
        System.out.println("Nhập vào địa chỉ hộ dân ");
        String address = scanner.nextLine();
        hoDan.setDiaChi(address);
        System.out.println("Trong nhà có bao nhiêu người ");
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            System.out.println("Nhập tên người trong nhà : ");
            String name = scanner.nextLine();
            Nguoi a = MethodNguoi.getNguoiByName(name);
            nguoi.add(a);
        }
        hoDan.setNguoi(nguoi);
        hoDan.setSoNguoi(nguoi.size());
        return hoDan;
    }
    public KhuPho getInforKhuPho(){
        List<HoDan> hoDans = new ArrayList<>();
        KhuPho khuPho = new KhuPho();
        System.out.println("Nhập vào tên khu phố ");
        String namePho = scanner.nextLine();
        khuPho.setNameKhuPho(namePho);
        System.out.println("Khu Phố này có bao nhiêu hộ dân ");
        int countHoDan = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < countHoDan; i++) {
            System.out.println("Nhập địa chỉ hộ dân thuộc khu phố ");
            String address = scanner.nextLine();
            HoDan b = MethodHoDan.getHoDanByDiaChi(address);
            hoDans.add(b);
        }
        khuPho.setHoDans(hoDans);
        return khuPho;
    }
}
