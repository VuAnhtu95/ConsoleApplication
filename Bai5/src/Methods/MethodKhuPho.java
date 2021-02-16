package Methods;

import Infor.KhuPho;

import java.util.ArrayList;
import java.util.List;

public class MethodKhuPho {
    static List<KhuPho> khuPhos = new ArrayList<>();
    public void add(KhuPho khuPho){
        khuPhos.add(khuPho);
    }
    public void show(){
        for (KhuPho a: khuPhos) {
            System.out.println(a.toString());
        }
    }
}
