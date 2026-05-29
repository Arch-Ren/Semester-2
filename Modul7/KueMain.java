package Modul7;

public class KueMain {
    public static void main(String[] args) {
        Cake[] Kue = new Cake[20];

        Kue[0] = new KuePesanan("Black Forest", 100000, 2);
        Kue[1] = new KueJadi("CheeseCake", 50000, 3);
        Kue[2] = new KuePesanan("Red Velvet", 75000, 1.5);
        Kue[3] = new KueJadi("Tiramisu", 120000, 2.5);
        Kue[4] = new KuePesanan("Croissant", 25000, 0.5);
        Kue[5] = new KueJadi("Macaron", 15000, 1);
        Kue[6] = new KuePesanan("Brownies", 30000, 1);
        Kue[7] = new KueJadi("Chiffon Cake", 40000, 2);
        Kue[8] = new KuePesanan("Cupcake", 20000, 0.5);
        Kue[9] = new KueJadi("Apple Pie", 35000, 1.5);
        Kue[10] = new KuePesanan("Lapis Legit", 50000, 2);
        Kue[11] = new KueJadi("Kue Lumpur", 10000, 0.5);
        Kue[12] = new KuePesanan("Klepon", 5000, 1);
        Kue[13] = new KueJadi("Bika Ambon", 25000, 1.5);
        Kue[14] = new KuePesanan("Kue Cucur", 15000, 0.5);
        Kue[15] = new KueJadi("Nagasari", 20000, 1);
        Kue[16] = new KuePesanan("Onde-Onde", 10000, 0.5);
        Kue[17] = new KueJadi("Lapis Kanji", 30000, 1.5);
        Kue[18] = new KuePesanan("Kue Mangkok", 15000, 0.5);
        Kue[19] = new KueJadi("Serabi", 20000, 1);

        // tampilkan semua kue
        for (int i = 0; i < Kue.length; i++) {
            System.out.println(Kue[i].toString());
        }
        System.out.println();

        // hitung total harga semua jenis
        double totalHarga = 0;
        for (int i = 0; i < Kue.length; i++) {
            totalHarga += Kue[i].hitungHarga();
        }
        System.out.printf("Total Harga Semua Kue: Rp %,.2f\n", totalHarga);

        System.out.println();

        // hitung total harga dan berat kue pesanan
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (int i = 0; i < Kue.length; i++) {
            if (Kue[i] instanceof KuePesanan) {
                totalHargaPesanan += Kue[i].hitungHarga();
                totalBeratPesanan += ((KuePesanan) Kue[i]).getBerat();
            }
        }
        System.out.printf("Total Harga Kue Pesanan: Rp %,.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat Kue Pesanan: %.2f kg\n", totalBeratPesanan);

        System.out.println();

        // hitung total harga dan jumlah kue jadi
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (int i = 0; i < Kue.length; i++) {
            if (Kue[i] instanceof KueJadi) {
                totalHargaJadi += Kue[i].hitungHarga();
                totalJumlahJadi += ((KueJadi) Kue[i]).getJumlah();
            }
        }
        System.out.printf("Total Harga Kue Jadi: Rp %,.2f\n", totalHargaJadi);
        System.out.printf("Total Jumlah Kue Jadi: %.2f pcs\n", totalJumlahJadi);

        System.out.println();

        // harga akhir kue terbesar
        double hargaTerbesar = Kue[0].hitungHarga();
        int temp = 0;
        for (int i = 0; i < Kue.length; i++) {
            if (Kue[i].hitungHarga() > hargaTerbesar) {
                hargaTerbesar = Kue[i].hitungHarga();
                temp = i;
            }
        }
        System.out.printf("Harga Kue Terbesar: Rp %,.2f | %s\n", hargaTerbesar, Kue[temp].getNama());
    }
}
