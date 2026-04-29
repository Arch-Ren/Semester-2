package Modul9.Bab8_GUI;

public class ASD extends MataKuliah {
    public ASD() {
        super("ASD");
    }

    @Override
    public double hitungNilaiAkhir() {
        nilaiAkhir = (tugas * 0.25) + (kuis * 0.25) + (uts * 0.25) + (uas * 0.25);
        return nilaiAkhir;
    }
}
