package Methods;

import QuanLy.Sach;

import java.util.ArrayList;

public class methodSach {
    static ArrayList<Sach> sachs = new ArrayList<>();

    public void add(Sach sach){
        sachs.add(sach);
    }

    public void show(){
        for (Sach i: sachs) {
            System.out.println(i.toString());
        }
    }
    public static Sach getSachbyCode(int code){
        Sach ss = null;
        for (Sach s:sachs) {
            if (s.getCodeSach() == code){
                ss = s;
            }
        }
        return ss;
    }
    public void remove(int id){
        for (Sach h: sachs) {
            if (h.getId() == id){
                sachs.remove(id);
            }
        }
    }
}
