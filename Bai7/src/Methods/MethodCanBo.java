package Methods;

import QuanLy.CanBo;

import java.util.ArrayList;
import java.util.List;

public class MethodCanBo {
    static List<CanBo> canBos = new ArrayList<>();

    public void add(CanBo canBo){
        canBos.add(canBo);
    }
    public void show(){
        for (CanBo i : canBos) {
            System.out.println(i.toString());
        }
    }
    public void showLuongThucLinh(){
        for (CanBo i : canBos) {
            System.out.println("Lương thực lĩnh của cán bộ "+ i.getName()+ " là " + i.getLuongThucLinh()+ " đồng ");
        }
    }
    public CanBo getCanBoByLuong(){
        CanBo o = null;
        for (CanBo i : canBos) {
            if (i.getLuongThucLinh() >= 8000000){
                o = i;
            }
        }
        return o;
    }
    public static CanBo getCanBoByName(String name){
        CanBo c = null;
        for (CanBo a : canBos) {
            if (a.getName().equals(name)){
                c = a;
            }
        }
        return c;
    }
}
