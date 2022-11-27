package Pertemuan10;

public abstract class BangunDatar {
    String warna;

    public BangunDatar (String warna){
        this.warna = warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return this.warna;
    }

    public abstract void draw();

    public abstract float luas();

}
