package Semester2.AkunBank;

import java.util.Scanner;

public class MainAkun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Akun Jason = new Akun("Jason", "Jason1234", "Jason_1234", 0);
        boolean running = true;
        while (running) {
            System.out.println("Menu: ");
            System.out.println("1. Buat Akun");
            System.out.println("2. Tambah Saldo");
            System.out.println("3. Tarik Saldo");
            System.out.println("4. Cek Saldo");
            System.out.println("5. Keluar");
            int pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    Akun akunBaru = new Akun();
                    String username = "";
                    String noRek= "";
                    String password = "";
                    while(akunBaru.getUsername() == null) {
                        System.out.print("Masukkan username: ");
                        username = input.nextLine();
                        akunBaru.setUsername(username);
                    }
                    while(akunBaru.getNoRek() == null) {
                        System.out.print("Masukkan nomor rekening: ");
                        noRek = input.nextLine();
                        akunBaru.setNoRek(noRek);
                    }
                    while(akunBaru.getPassword() == null) {
                        System.out.print("Masukkan password: ");
                        password = input.nextLine();
                        akunBaru.setPassword(password);
                    }
                break;
            
                case 2:
                    while(Jason.getSaldo() == 0) {
                        System.out.print("Masukkan jumlah saldo: ");
                        int jumlahSaldo = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan password: ");
                        String Password = input.nextLine();
                        System.out.println();
                        if(Password.equals(Jason.getPassword())) {
                            Jason.tambahSaldo(jumlahSaldo, Password);
                        }
                    }
                    break;
                
                case 3:
                    System.out.print("Masukkan jumlah tarikan saldo: ");
                    int tarik = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan password: ");
                    String Password = input.nextLine();
                    System.out.println();
                    Jason.tarikSaldo(tarik, Password);
                    break;
                    
                case 4:
                    System.out.println("Saldo " + Jason.getUsername() + " saat ini: " + Jason.getSaldo());
                    break;
                
                case 5:
                    running = false;
                    break;
            }
        }
    }
}
