package Modul7;

public class KueJadi extends Cake {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        this.setName(nama);
        this.setHarga(harga);
        this.setJumlah(jumlah);
    }

    public KueJadi() {
    };

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return this.jumlah;
    }

    public double hitungHarga() {
        return jumlah * getHarga() * 2;
    }
}
