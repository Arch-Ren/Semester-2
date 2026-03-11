package Semester2;

public class Segitiga {
    double alas;
    double tinggi;
    double luas;
    double keliling;
    String nama;
    final int JUMLAHSISI = 3;
    //aturan nama atribut dan method class

    Segitiga() {}   //untuk memanggil inisiasi objek
    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    //constructor kosong dan berisi parameter
    
    double hitungLuas() {
        double luas = 0.5*alas*tinggi;
        this.luas = luas;
        return luas;
    }

    void cetakLuas() {
        System.out.println("Luas segitiga adalah " + luas);
    }
}