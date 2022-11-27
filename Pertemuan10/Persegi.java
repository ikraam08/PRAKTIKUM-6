package Pertemuan10;

public class Persegi extends BangunDatar {
    private float panjang;
    private float lebar;

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

    }

    @Override
    public void draw() {

        System.out.println("Gambar persegi");
    }

    @Override
    public float luas() {

        return (panjang * lebar);
    }
}
