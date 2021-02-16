package Methods;

import Infor.HoDan;

import java.util.ArrayList;
import java.util.List;

public class MethodHoDan {
    static List<HoDan> hoDans = new ArrayList<>();
    public void add(HoDan hoDan){
        hoDans.add(hoDan);
    }
    public void show(){
        for (HoDan i : hoDans) {
            System.out.println(i.toString());
        }
    }
    public static HoDan getHoDanByDiaChi(String address){
        HoDan hoDan = null;
        for (HoDan a : hoDans) {
            if (a.getDiaChi().equals(address)){
                hoDan = a;
            }
        }
        return hoDan;
    }
}
