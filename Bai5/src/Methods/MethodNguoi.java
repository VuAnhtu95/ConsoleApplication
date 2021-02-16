package Methods;

import Infor.Nguoi;

import java.util.ArrayList;

public class MethodNguoi {
    static ArrayList<Nguoi> nguois = new ArrayList<>();

    public void add(Nguoi nguoi){
        nguois.add(nguoi);
    }
    public void show(){
        for (Nguoi i: nguois) {
            System.out.println(i.toString());
        }
    }
    public static Nguoi getNguoiByName(String name){
        Nguoi nguoi = null;
        for (Nguoi b : nguois) {
            if (b.getHoTen().equals(name)){
                nguoi = b;
            }
        }
        return nguoi;
    }
}
