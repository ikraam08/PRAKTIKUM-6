package Pertemuan10;
//Call Method
public class Main {
    public static void main(String[] args) {

        //Pembuatan object dari Subclass dengan polymorphic tipe data BangunDatar

        BangunDatar lingkaran =new Lingkaran("Hitam",500);
        BangunDatar persegi =new Persegi("Kuning",250,250);
        BangunDatar segitiga= new Segitiga("Hijau",200,260);

        //Pengubahan warna dengan setter
        lingkaran.setWarna("Merah");

        //Pemanggilan Abstract Method draw
        lingkaran.draw();
        segitiga.draw();
        persegi.draw();

        //Pemanggilan Abstract Method luas
        System.out.println();
        System.out.println("\nLuas Lingkaran\t: " + lingkaran.luas());
        System.out.println("Luas Persegi\t: " + persegi.luas());
        System.out.println("Luas Segitiga\t: " + segitiga.luas());





    }
}
