package Pertemuan10;
// Inherite Dari Bangun Datar
public class Segitiga extends BangunDatar{
    //Atribute
    private final int alas;
    private final int tinggi;

    // Overloading constructor
    public Segitiga(String warna,int alas, int tinggi) {
        super(warna);
        this.tinggi = tinggi;
        this.alas = alas;

    }
    // overriding Abstract method draw
    @Override
    public void draw() {
        System.out.println("\n"+getWarna());
        System.out.println("Gambar Segitiga");
    }
    //overriding Abstract method luas
    @Override
    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }
}
