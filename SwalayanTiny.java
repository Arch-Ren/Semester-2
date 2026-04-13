public class SwalayanTiny {
    private String namaPelanggan, nomorPelanggan;
    private int pin;
    private double saldoPelanggan;

    public SwalayanTiny() {
        namaPelanggan = null;
        nomorPelanggan = null;
        saldoPelanggan = 0d;
        pin = 00000;
    }
    public SwalayanTiny(String nama, String nomor, double saldo, int pin) {
        this.namaPelanggan = nama;
        this.nomorPelanggan = nomor;
        this.saldoPelanggan = saldo;
        this.pin = pin;
    }

    public void setNama(String nama) {
        this.namaPelanggan = nama;
    }
    public void setNomor(String nomor) {
        String[] cekNomor = nomor.split("");
        if(cekNomor.length < 10 || cekNomor.length > 10) {
            System.out.println("Nomor tidak valid.");
            return;
        }
        this.nomorPelanggan = nomor;
    }
    public void setSaldo(double saldo) {
        this.saldoPelanggan = saldo;
    }
    public void setPIN(int pin) {
        this.pin = pin;
    }
    public String getNama() {
        return namaPelanggan;
    }
    public String getNomor() {
        return nomorPelanggan;
    }
    public double getSaldo() {
        return saldoPelanggan;
    }
    public int getPIN() {
        return pin;
    }

    public void cetakInfo(SwalayanTiny p) {
        System.out.println("Nama Pelanggan: " + p.getNama());
        System.out.println("Nomor Pelanggan: " + p.getNomor());
        System.out.printf("Saldo Pelanggan: %.0f\n", p.getSaldo());
        if (p.cekJenis(p.getNomor()).equals("3")) {
            System.out.println("Jenis Pelanggan: Silver");
        } else if (p.cekJenis(p.getNomor()).equals("5")) {
            System.out.println("Jenis Pelanggan: Gold");
        } else if (p.cekJenis(p.getNomor()).equals("7")) {
            System.out.println("Jenis Pelanggan: Platinum");
        }
    }

    public String cekJenis(String nomor) {
        String[] tempNomor = nomor.split("");
        return tempNomor[0];
    }

    public void transaksi(SwalayanTiny p, double totalBeli, String inputNomor) {
        String[] tempNomor = inputNomor.split("");
        if(tempNomor.length < 10) {
            System.out.println("nomor rekening tidak valid");
            return;
        }
        if(inputNomor.equalsIgnoreCase(p.getNomor())) {
            if(p.cekJenis(inputNomor).equals("3")) {
                if(totalBeli > 1000000) {
                    double cashback = 5d/100 * totalBeli;
                    double temp = p.getSaldo();
                    temp -= totalBeli;
                    if(temp < 10000) {
                        System.out.println("Saldo minimal 10000. Transaksi dibatalkan karena saldo akhir kurang.");
                        return;
                    }
                    temp += cashback;
                    p.setSaldo(temp);
                } else {
                    double temp = p.getSaldo();
                    temp -= totalBeli;  
                    if(temp < 10000) {
                        System.out.println("Saldo minimal 10000. Transaksi dibatalkan karena saldo akhir kurang.");
                        return;
                    }                  
                    p.setSaldo(temp);
                }
            } else if (p.cekJenis(inputNomor).equals("5")) {
                if(totalBeli > 1000000) {
                    double cashback = 7d/100 * totalBeli;
                    double temp = p.getSaldo();
                    temp -= totalBeli;
                    if(temp < 10000) {
                        System.out.println("Saldo minimal 10000. Transaksi dibatalkan karena saldo akhir kurang.");
                        return;
                    }
                    temp += cashback;
                    p.setSaldo(temp);
                } else {
                    double cashback = 2d/100 * totalBeli;
                    double temp = p.getSaldo();
                    temp -= totalBeli;
                    if(temp < 10000) {
                        System.out.println("Saldo minimal 10000. Transaksi dibatalkan karena saldo akhir kurang.");
                        return;
                    }
                    temp += cashback;
                    p.setSaldo(temp);
                }
            } else if (p.cekJenis(inputNomor).equals("7")) {
                if(totalBeli > 1000000) {
                    double cashback = 1d/10 * totalBeli;
                    double temp = p.getSaldo();
                    temp -= totalBeli;
                    if(temp < 10000) {
                        System.out.println("Saldo minimal 10000. Transaksi dibatalkan karena saldo akhir kurang.");
                        return;
                    }
                    temp += cashback;
                    p.setSaldo(temp);
                } else {
                    double cashback = 5d/100 * totalBeli;
                    double temp = p.getSaldo();
                    temp -= totalBeli;
                    if(temp < 10000) {
                        System.out.println("Saldo minimal 10000. Transaksi dibatalkan karena saldo akhir kurang.");
                        return;
                    }
                    temp += cashback;
                    p.setSaldo(temp);
                }
            }
        }
    }
}