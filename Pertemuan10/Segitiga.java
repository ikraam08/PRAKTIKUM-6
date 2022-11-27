package Pertemuan10;

public class Segitiga extends BangunDatar{
        private int alas;
        private int tinggi;

        public Segitiga(String warna,int alas, int tinggi) {
            super(warna);
            this.tinggi = tinggi;
            this.alas = alas;

        }

        @Override
        public void draw(String warna) {
            System.out.println(getWarna());
            System.out.println("Gambar Segitiga");
        }
        @Override
        public float luas() {
            return (float) (0.5 * alas * tinggi);
        }
    }


