package Modul9.Bab8_GUI;

public class Matkomlan extends MataKuliah {
    public Matkomlan() {
        super("Matkomlan");
    }

    @Override
    public double hitungNilaiAkhir() {
        nilaiAkhir = (tugas * 0.4) + (kuis * 0.4) + (uts * 0.1) + (uas * 0.1);
        return nilaiAkhir;
    }
}
