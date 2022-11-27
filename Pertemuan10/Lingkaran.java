package Pertemuan10;

public class Lingkaran extends BangunDatar {
    private final int r;

    public Lingkaran(String warna,int r) {
        super(warna);
        this.r = r;
    }


    @Override
    public void draw() {
        System.out.println("Gambar Bangun Datar");
        System.out.println("\n" + getWarna());
        System.out.println("Gambar Lingkaran");
    }

    public float luas() {
        System.out.println("Luas Bangun Datar");
        return (float) (Math.PI * r *r);
    }

}