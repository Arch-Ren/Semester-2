package Modul5;

public class LabKomdas {
    private final double jacketA = 100000d;
    private final double jacketB = 125000d;
    private final double jacketC = 175000d;
    double hargaFinal;

    public double hargaAkhir(int kodeBarang, int jumlahBeli) {
        if( jumlahBeli > 100) {
            switch(kodeBarang) {
                case 1:
                    hargaFinal = jacketA - 5000;
                    return hargaFinal;
                
                case 2:
                    hargaFinal = jacketB - 5000;
                    return hargaFinal;

                case 3:
                    hargaFinal = jacketC - 15000;
                    return hargaFinal;
            }
        } else {
            switch(kodeBarang) {
                case 1:
                    return jacketA;
                
                case 2:
                    return jacketB;

                case 3:
                    return jacketC;
            }
        }
        return 0;
    }

    public double hitungHarga(int kodeBarang, int jumlahBeli) {
        double hargaBarang = hargaAkhir(kodeBarang, jumlahBeli);
        double hargaJual = hargaBarang * jumlahBeli;
        return hargaJual;
    }
}