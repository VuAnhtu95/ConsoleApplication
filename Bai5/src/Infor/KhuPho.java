package Infor;

import java.util.List;

public class KhuPho {
    private int id ;
    private String nameKhuPho;
    List<HoDan> hoDans;

    public KhuPho(){}
    public KhuPho(int id, String nameKhuPho, List<HoDan> hoDans) {
        this.id = id;
        this.nameKhuPho = nameKhuPho;
        this.hoDans = hoDans;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameKhuPho() {
        return nameKhuPho;
    }

    public void setNameKhuPho(String nameKhuPho) {
        this.nameKhuPho = nameKhuPho;
    }

    public List<HoDan> getHoDans() {
        return hoDans;
    }

    public void setHoDans(List<HoDan> hoDans) {
        this.hoDans = hoDans;
    }
    @Override
    public String toString(){
        return "Khu Phố " + nameKhuPho + " gồm những hộ dân " + "\n" + hoDans + "\n";
    }
}
