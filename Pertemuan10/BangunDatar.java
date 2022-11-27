package Pertemuan10;

// Abstrak class Bangun Datar
public abstract class BangunDatar {
    // Atribute Warna
    String warna;

    // Constructor Bangun Datar
    public BangunDatar (String warna){
        this.warna = warna;
    }

    //SETTER
    public void setWarna(String warna) {
        this.warna = warna;
    }
    //GETTER

    public String getWarna() {

        return this.warna;
    }

    // Abstract Method
    public abstract void draw();

    public abstract float luas();

}
