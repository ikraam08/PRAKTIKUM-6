package Pertemuan10;

public class Main {
    public static void main(String[] args) {

        BangunDatar lingkaran =new Lingkaran(500);
        BangunDatar persegi =new Persegi(50,50);
        BangunDatar segitiga= new Segitiga(30,60);
        lingkaran.draw();
        segitiga.draw();
        persegi.draw();
        System.out.println();
        System.out.println("\nLuas Lingkaran\t: " + lingkaran.luas());
        System.out.println("Luas Persegi\t: " + persegi.luas());
        System.out.println("Luas Segitiga\t: " + segitiga.luas());





    }
}
