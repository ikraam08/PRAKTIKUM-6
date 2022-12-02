package Pertemuan10;

// Inherite Dari Bangun Datar
public class Persegi extends BangunDatar {
    // Atribute
    private final float panjang;
    private final float lebar;

    //Overloading constructor
    public Persegi(String warna,float panjang, float lebar) {
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;

    }

    //Overide Abstract Method Gambar
    @Override
    public void draw() {
        System.out.println("\n"+getWarna());
        System.out.println("Gambar Persegi");
    }

    //Overriding Abstract Method Luas
    @Override
    public float luas() {

        return (panjang * lebar);
    }
}