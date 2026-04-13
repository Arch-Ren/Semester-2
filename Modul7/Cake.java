package Modul7;

abstract class Cake {
    private String name;
    private double price;

    public void Cake() {

    }

    public void Cake(String nama, double harga) {
        this.name = nama;
        this.price = harga;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHarga(double harga) {
        this.price = harga;
    }

    public String getNama() {
        return this.name;
    }

    public double getHarga() {
        return this.price;
    }

    public abstract double hitungHarga();

    public String toString() {
        return String.format("Nama: %-12s | Harga: Rp %,.2f", this.name, this.price);
    }
}
