package Modul8;

import java.util.Scanner;

public class MakhlukHidupMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();
        Manusia m = new Manusia(nama, umur);
        m.tampilkanNama();
        m.tampilkanUmur();
        m.makan();
        m.berjalan();
        m.bersuara();

        Manusia m2 = new Manusia();
        System.out.print("Masukkan nama: ");
        String nama2 = input.nextLine();
        m2.setNama(nama2);
        System.out.print("Masukkan umur: ");
        int umur2 = input.nextInt();
        m2.setUmur(umur2);
        m2.tampilkanNama();
        m2.tampilkanUmur();
        m2.makan();
        m2.berjalan();
        m.bersuara();
    }
}
