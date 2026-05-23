package Modul11;

public class DataType {
    String namaTim;
    int noPemain;
    int tinggiBadan; // dalam cm
    int beratBadan;  // dalam kg

    public DataType(String namaTim, int noPemain, int tinggiBadan, int beratBadan) {
        this.namaTim = namaTim;
        this.noPemain = noPemain;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    // Mengubah data objek menjadi teks saat dicetak
    @Override
    public String toString() {
        return String.format("[%s] %d -> TB: %d cm, BB: %d kg", namaTim, noPemain, tinggiBadan, beratBadan);
    }
}
