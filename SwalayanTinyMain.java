<<<<<<< HEAD
import java.util.Scanner;

public class SwalayanTinyMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        SwalayanTiny p1 = new SwalayanTiny();
        p1.setNama("Json");
        p1. setNomor("3812345678");
        p1.setSaldo(10000000);
        p1.setPIN(12345);
        SwalayanTiny p2 = new SwalayanTiny("Rei", "5612345678", 10000000, 12345);
        SwalayanTiny p3 = new SwalayanTiny("Mourax", "7412345678", 10000000, 12345);
        SwalayanTiny[] demoPelanggan = {p1, p2, p3};

        SwalayanTiny pelangganAktif = null;
        System.out.print("Untuk login, masukkan nomor pelanggan dan pin. \nNo. Pelanggan: ");
        String nomorPelanggan = input.nextLine();
        for(SwalayanTiny p : demoPelanggan) {
            int pinCounterLogin = 0;
            boolean PINLogin = false;
            if (p.getNomor().equals(nomorPelanggan)) {
                while (PINLogin == false) {
                    if (pinCounterLogin == 3) {
                        System.out.println("Akun anda diblokir karena salah memasukkan PIN sebanyak 3 kali.");
                        return;
                    }
                    System.out.print("PIN: ");
                    int inputPIN = input.nextInt();
                    input.nextLine();
                    if(p.getPIN() == inputPIN) {
                        System.out.println("Halo " + p.getNama());
                        System.out.println("==========");
                        p.cetakInfo(p);
                        System.out.println("==========");
                        pelangganAktif = p;
                        PINLogin = true;
                        break;
                    } else {  
                        pinCounterLogin++;
                        System.out.println("PIN yang anda masukkan salah. " + (3-pinCounterLogin) + " kesempatan tersedia");
                    }
                }
            }
        }
        int pilihan = 0;
        while (pilihan != 9) {
            System.out.println("Pilihan transaksi: \n1. Pembelian \n2. Top Up \n9. Keluar");
            System.out.print("Silahkan pilih opsi transaksi: ");
            pilihan = input.nextInt();
            input.nextLine();
            int pinCounter = 0;
            boolean cekPIN = false;
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan harga barang yang dibeli: ");
                    double harga = input.nextDouble();
                    input.nextLine();
                    while (cekPIN == false) {
                        System.out.print("Masukkan PIN: ");
                        int PINBayar = input.nextInt();
                        input.nextLine();
                        if(PINBayar != pelangganAktif.getPIN()) {
                            pinCounter++;
                            if (pinCounter == 3) {
                                System.out.println("Akun anda diblokir karena salah memasukkan PIN sebanyak 3 kali.");
                                return;
                            }
                            System.out.println("PIN yang anda masukkan salah. " + (3-pinCounter) + " kesempatan tersedia");
                        } else {
                            pelangganAktif.transaksi(pelangganAktif, harga, nomorPelanggan);
                            System.out.println("Saldo anda saat ini Rp. " + pelangganAktif.getSaldo());
                            break;
                        }
                    } break;
                
                case 2:
                    System.out.print("Masukkan jumlah Top Up: ");
                    double jumlahTopUp = input.nextDouble();
                    input.nextLine();
                    while (cekPIN == false) {
                        System.out.print("Masukkan PIN: ");
                        int PINTopUp = input.nextInt();
                        input.nextLine();
                        if(PINTopUp != pelangganAktif.getPIN()) {
                            pinCounter++;
                            if (pinCounter == 3) {
                                System.out.println("Akun anda diblokir karena salah memasukkan PIN sebanyak 3 kali.");
                                break;
                            }
                            System.out.println("PIN yang anda masukkan salah. " + (3-pinCounter) + " kesempatan tersedia");
                        } else {
                            pelangganAktif.transaksi(pelangganAktif, jumlahTopUp, nomorPelanggan);
                            System.out.println("Saldo anda saat ini Rp. " + pelangganAktif.getSaldo());
                            break;
                        }
                    } break;

                case 9:
                    System.out.println("Terima kasih sudah bertransaksi.");
                    break;

                default:
                    System.out.println("Opsi tidak ditemukan. Transaksi dibatalkan.");
                    break;
            }
            if (pinCounter == 3) {
                return;
            }
        }
    }
=======
import java.util.Scanner;

public class SwalayanTinyMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        SwalayanTiny p1 = new SwalayanTiny();
        p1.setNama("Json");
        p1. setNomor("3812345678");
        p1.setSaldo(10000000);
        p1.setPIN(12345);
        SwalayanTiny p2 = new SwalayanTiny("Rei", "5612345678", 10000000, 12345);
        SwalayanTiny p3 = new SwalayanTiny("Mourax", "7412345678", 10000000, 12345);
        SwalayanTiny[] demoPelanggan = {p1, p2, p3};

        SwalayanTiny pelangganAktif = null;
        System.out.print("Untuk login, masukkan nomor pelanggan dan pin. \nNo. Pelanggan: ");
        String nomorPelanggan = input.nextLine();
        for(SwalayanTiny p : demoPelanggan) {
            int pinCounterLogin = 0;
            boolean PINLogin = false;
            if (p.getNomor().equals(nomorPelanggan)) {
                while (PINLogin == false) {
                    if (pinCounterLogin == 3) {
                        System.out.println("Akun anda diblokir karena salah memasukkan PIN sebanyak 3 kali.");
                        return;
                    }
                    System.out.print("PIN: ");
                    int inputPIN = input.nextInt();
                    input.nextLine();
                    if(p.getPIN() == inputPIN) {
                        System.out.println("Halo " + p.getNama());
                        System.out.println("==========");
                        p.cetakInfo(p);
                        System.out.println("==========");
                        pelangganAktif = p;
                        PINLogin = true;
                        break;
                    } else {  
                        pinCounterLogin++;
                        System.out.println("PIN yang anda masukkan salah. " + (3-pinCounterLogin) + " kesempatan tersedia");
                    }
                }
            }
        }
        int pilihan = 0;
        while (pilihan != 9) {
            System.out.println("Pilihan transaksi: \n1. Pembelian \n2. Top Up \n9. Keluar");
            System.out.print("Silahkan pilih opsi transaksi: ");
            pilihan = input.nextInt();
            input.nextLine();
            int pinCounter = 0;
            boolean cekPIN = false;
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan harga barang yang dibeli: ");
                    double harga = input.nextDouble();
                    input.nextLine();
                    while (cekPIN == false) {
                        System.out.print("Masukkan PIN: ");
                        int PINBayar = input.nextInt();
                        input.nextLine();
                        if(PINBayar != pelangganAktif.getPIN()) {
                            pinCounter++;
                            if (pinCounter == 3) {
                                System.out.println("Akun anda diblokir karena salah memasukkan PIN sebanyak 3 kali.");
                                return;
                            }
                            System.out.println("PIN yang anda masukkan salah. " + (3-pinCounter) + " kesempatan tersedia");
                        } else {
                            pelangganAktif.transaksi(pelangganAktif, harga, nomorPelanggan);
                            System.out.println("Saldo anda saat ini Rp. " + pelangganAktif.getSaldo());
                            break;
                        }
                    } break;
                
                case 2:
                    System.out.print("Masukkan jumlah Top Up: ");
                    double jumlahTopUp = input.nextDouble();
                    input.nextLine();
                    while (cekPIN == false) {
                        System.out.print("Masukkan PIN: ");
                        int PINTopUp = input.nextInt();
                        input.nextLine();
                        if(PINTopUp != pelangganAktif.getPIN()) {
                            pinCounter++;
                            if (pinCounter == 3) {
                                System.out.println("Akun anda diblokir karena salah memasukkan PIN sebanyak 3 kali.");
                                break;
                            }
                            System.out.println("PIN yang anda masukkan salah. " + (3-pinCounter) + " kesempatan tersedia");
                        } else {
                            pelangganAktif.transaksi(pelangganAktif, jumlahTopUp, nomorPelanggan);
                            System.out.println("Saldo anda saat ini Rp. " + pelangganAktif.getSaldo());
                            break;
                        }
                    } break;

                case 9:
                    System.out.println("Terima kasih sudah bertransaksi.");
                    break;

                default:
                    System.out.println("Opsi tidak ditemukan. Transaksi dibatalkan.");
                    break;
            }
            if (pinCounter == 3) {
                return;
            }
        }
    }
>>>>>>> 17c73b0ded14f6eeec4479b892a59bb387446624
}