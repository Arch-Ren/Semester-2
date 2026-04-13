import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //instan objek bernama m1
        Mobil m1 = new Mobil();

        m1.setKecepatan(input.nextInt());
        input.nextLine();
        m1.setManufaktur(input.nextLine());
        m1.setNoPlat(input.nextLine());
        m1.setWarna(input.nextLine());
        m1.setWaktu(input.nextDouble());
        m1.displayMessage();

        System.out.println("================");

        //instan objek baru bernama m2
        Mobil m2 = new Mobil();

        m2.setKecepatan(input.nextInt());
        input.nextLine();
        m2.setManufaktur(input.nextLine());
        m2.setNoPlat(input.nextLine());
        m2.setWarna(input.nextLine());
        m2.setWaktu(input.nextDouble());
        m2.displayMessage();

        System.out.println("================");

        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}