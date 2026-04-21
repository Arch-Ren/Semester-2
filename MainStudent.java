import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        input.nextLine();
        String[] namaSiswa = new String[jumlahSiswa];
        String[] alamatSiswa = new String[jumlahSiswa];
        int[] umurSiswa = new int[jumlahSiswa];
        int[] nilaiMatematika = new int[jumlahSiswa];
        int[] nilaiInggris = new int[jumlahSiswa];
        int[] nilaiScience = new int[jumlahSiswa];
        int jumlahObjek = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nama siswa ke-(i+1): ");
            String nama = input.nextLine();
            namaSiswa[i] = nama;
            System.out.println("Masukkan alamat siswa ke (i+1): ");
            String alamat = input.nextLine();
            alamatSiswa[i] = alamat;
            System.out.print("Masukkan umur siswa ke (i+1): ");
            int umur = input.nextInt();
            umurSiswa[i] = umur;
            System.out.print("Masukkan nilai matematika siswa ke (i+1): ");
            int NMatematika = input.nextInt();
            nilaiMatematika[i] = NMatematika;
            System.out.print("Masukkan nilai bahasa inggris siswa ke (i+1): ");
            int NInggris = input.nextInt();
            nilaiInggris[i] = NInggris;
            System.out.print("Masukkan nilai science siswa ke (i+1): ");
            int NScience = input.nextInt();
            nilaiScience[i] = NScience;
            input.nextLine();

            student siswa1 = new student(nama, alamat, umur, NMatematika, NInggris, NScience);
            siswa1.displayMessage();
            jumlahObjek++;
        }

        student siswa = new student();
        siswa.tampilkanJumlahObjek(jumlahObjek);
    }
}
