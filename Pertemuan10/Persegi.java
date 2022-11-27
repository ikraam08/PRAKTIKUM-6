package Pertemuan10;

public class Persegi extends BangunDatar {
    private final float panjang;
    private final float lebar;

    public Persegi(String warna,float panjang, float lebar) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;

    }
    @Override
    public void draw() {
        System.out.println(getWarna());
        System.out.println("Gambar Persegi");
    }

    @Override
    public float luas() {

        return (panjang * lebar);
    }
}