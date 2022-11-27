# PRAKTIKUM6
## Pemrograman Orientasi Objek

````shell
Nama   : Ikram Ramadhan
Nim    : 312110478
Matkul : Pemrograman Orientasi Objek
````


### 1. File BangunDatar.java
* *CODINGAN FILE 1

```java
package Pertemuan10;

public abstract class BangunDatar {
    String warna;

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public abstract void draw();

    public abstract float luas();

}
```

### 2.Lingkaran.java
* *CODINGAN FILE 2
```java
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

```
### 3.Persegi.java
* *CODINGAN FILE 3
```java
package Pertemuan10;

public class Persegi extends BangunDatar {
    private float panjang;
    private float lebar;

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;

    }

    @Override
    public void draw() {

        System.out.println("Gambar persegi");
    }

    @Override
    public float luas() {

        return (panjang * lebar);
    }
}

```
### 4.Segitiga.Main.java
* *CODINGAN FILE 4
```java
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

```
### 5.Main.Main.java
* *CODINGAN FILE 5
```java
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
```

* *Hasil output program:*
  ![img 1](ssan/ssan1.png)
