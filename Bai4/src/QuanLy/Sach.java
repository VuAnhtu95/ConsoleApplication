package QuanLy;

public class Sach {
    private String nameSach;
    private int id;
    private int codeSach;
    public Sach(){

    }

    public Sach(String nameSach, int id, int codeSach) {
        this.nameSach = nameSach;
        this.id = id;
        this.codeSach = codeSach;
    }

    public String getNameSach() {
        return nameSach;
    }

    public void setNameSach(String nameSach) {
        this.nameSach = nameSach;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodeSach() {
        return codeSach;
    }

    public void setCodeSach(int codeSach) {
        this.codeSach = codeSach;
    }
    @Override
    public String toString(){
        return " Sách có tên : " + nameSach +
                " Code của nó là : " + codeSach;
    }
}
