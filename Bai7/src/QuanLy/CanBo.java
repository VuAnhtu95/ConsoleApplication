package QuanLy;

public class CanBo {
    private int id;
    private String name;
    private String address;
    private int luongCung;
    private int thuong;
    private int phat;
    private int luongThucLinh;

    public CanBo(){}

    public CanBo(int id, String name, String address, int luongCung, int thuong, int phat, int luongThucLinh) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.luongCung = luongCung;
        this.thuong = thuong;
        this.phat = phat;
        this.luongThucLinh = luongThucLinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public int getPhat() {
        return phat;
    }

    public void setPhat(int phat) {
        this.phat = phat;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(int luongCung, int thuong , int phat) {
        this.luongThucLinh = luongCung + thuong - phat;
    }
    @Override
    public String toString(){
        return "Cán bộ " + name + " địa chỉ " + address ;
    }
}
