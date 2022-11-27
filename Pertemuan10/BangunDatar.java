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

    public void display(){
        System.out.println("Warna" +this.warna);
        System.out.println(getWarna());
    }

    public abstract void draw(String warna);

    public abstract float luas();

}


