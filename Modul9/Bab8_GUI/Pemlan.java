package Modul9.Bab8_GUI;

public class Pemlan extends MataKuliah {
    public Pemlan() {
        super("Pemlan");
    }

    @Override
    public double hitungNilaiAkhir() {
        nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        return nilaiAkhir;
    }
}
