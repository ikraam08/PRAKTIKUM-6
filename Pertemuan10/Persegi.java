package Pertemuan10;

public class Persegi extends BangunDatar {
    private float panjang;
    private float lebar;

    public Persegi(String warna,float panjang, float lebar) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;

    }
    @Override
    public void draw(String warna) {
        System.out.println(getWarna());
        System.out.println("Gambar Persegi");
    }

    @Override
    public float luas() {

        return (panjang * lebar);
    }
}
