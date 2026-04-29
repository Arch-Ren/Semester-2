package Modul9.Bab8_GUI;

public class Probstat extends MataKuliah {
    public Probstat() {
        super("Probstat");
    }

    @Override
    public double hitungNilaiAkhir() {
        nilaiAkhir = (tugas * 0.1) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
        return nilaiAkhir;
    }
}
