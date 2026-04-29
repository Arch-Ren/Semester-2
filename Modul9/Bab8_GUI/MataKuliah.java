package Modul9.Bab8_GUI;

public abstract class MataKuliah {
    String nama;
    double tugas, kuis, uts, uas;
    double nilaiAkhir;

    public MataKuliah(String nama) {
        this.nama = nama;
    }

    public void setNilai(double tugas, double kuis, double uts, double uas) {
        this.tugas = tugas;
        this.kuis = kuis;
        this.uts = uts;
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public abstract double hitungNilaiAkhir();

}
