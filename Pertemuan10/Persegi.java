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

    //Overide Abstract Method draw
    @Override
    public void draw() {
        System.out.println("\n"+getWarna());
        System.out.println("Gambar Persegi");
    }

    //Overloading Abstract Method luas
    @Override
    public float luas() {

        return (panjang * lebar);
    }
}