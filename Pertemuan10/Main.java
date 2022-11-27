package Pertemuan10;

public class Main {
    public static void main(String[] args) {

        BangunDatar lingkaran =new Lingkaran("Hitam",500);
        BangunDatar persegi =new Persegi("Kuning",50,50);
        BangunDatar segitiga= new Segitiga("Hijau",30,60);
        lingkaran.setWarna("Merah");
        lingkaran.draw();
        segitiga.draw();
        persegi.draw();
        System.out.println();
        System.out.println("\nLuas Lingkaran\t: " + lingkaran.luas());
        System.out.println("Luas Persegi\t: " + persegi.luas());
        System.out.println("Luas Segitiga\t: " + segitiga.luas());





    }
}
