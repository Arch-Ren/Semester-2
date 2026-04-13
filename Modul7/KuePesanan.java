package Modul7;

public class KuePesanan extends Cake {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        this.setName(nama);
        this.setHarga(harga);
        this.setBerat(berat);
    }

    public KuePesanan() {
    };

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getBerat() {
        return this.berat;
    }

    public double hitungHarga() {
        return berat * getHarga();
    }
}
