package Pertemuan10;

public class Segitiga extends BangunDatar{
        private int alas;
        private int tinggi;

        public Segitiga(int alas, int tinggi) {
            this.tinggi = tinggi;
            this.alas = alas;

        }

        @Override
        public void draw() {
            System.out.println("Gambar Segitiga");
        }
        @Override
        public float luas() {
            return (float) (0.5 * alas * tinggi);
        }
    }


