package Methods;

import QuanLy.TheMuon;

import java.util.ArrayList;

public class methodTheMuon {
    ArrayList<TheMuon> theMuons = new ArrayList<>();
    public void add(TheMuon theMuon){
        theMuons.add(theMuon);
    }

    public void show(){
        for (TheMuon i: theMuons) {
            System.out.println(i.toString());
        }
    }
}
