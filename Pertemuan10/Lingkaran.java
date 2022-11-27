package Pertemuan10;

//Inherite Dari Bangun Datar
public class Lingkaran extends BangunDatar {
    // Atribute Lingkaran
    private final int r;

    // Overload constructor
    public Lingkaran(String warna,int r) {
        super(warna);
        this.r = r;
    }

    // Abstract Methode draw
    @Override
    public void draw() {
        System.out.println("Gambar Bangun Datar");
        System.out.println("\n" + getWarna());
        System.out.println("Gambar Lingkaran");
    }
    // Abstract Method luas
    public float luas() {
        System.out.println("Luas Bangun Datar");
        return (float) (Math.PI * r *r);
    }

}