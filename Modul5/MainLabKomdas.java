package Modul5;

import java.util.Scanner;

public class MainLabKomdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LabKomdas obj1 = new LabKomdas();

        System.out.println("Daftar Barang: \n1. Jacket A : Rp 100.000 \n2. Jacket B : Rp 125.000 \n3. Jacket C : Rp 175.000");
        System.out.print("Masukkan kode barang yang dibeli: ");
        int barangDibeli = input.nextInt();
        System.out.print("Masukkan jumlah pembelian: ");
        int jumlahBeli = input.nextInt();
        input.nextLine();

        double hargaFinal = obj1.hitungHarga(barangDibeli, jumlahBeli);
        System.out.printf( "Total pembelian adalah: Rp %,.2f%n", hargaFinal);    }
}
