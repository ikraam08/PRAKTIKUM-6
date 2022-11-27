package Pertemuan10;

public class Lingkaran extends BangunDatar {
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("Gambar Bangun Datar");
        System.out.println();
        System.out.println("Gambar Lingkaran");
    }

    public float luas() {
        System.out.println("Luas Bangun Datar");
        return (float) (Math.PI * r *r);
    }

}
