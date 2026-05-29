package Modul11;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<DataType> daftarPemain = DataTim.ambilDataMentah();

        // A. PENGURUTAN TINGGI BADAN (TB)
        // Ascending (Menaik: Rendah ke Tinggi)
        Collections.sort(daftarPemain, new Comparator<DataType>() {
            public int compare(DataType a, DataType b) {
                return a.tinggiBadan - b.tinggiBadan;
            }
        });
        System.out.println("\n[TB Ascending/Menaik]:");
        for (DataType pemain : daftarPemain) {
            System.out.println(pemain);
        }

        // Descending (Menurun: Tinggi ke Rendah)
        Collections.sort(daftarPemain, new Comparator<DataType>() {
            public int compare(DataType a, DataType b) {
                return b.tinggiBadan - a.tinggiBadan;
            }
        });
        System.out.println("\n[TB Descending/Menurun]:");
        for (DataType pemain : daftarPemain) {
            System.out.println(pemain);
        }

        // B. PENGURUTAN BERAT BADAN (BB)
        // Ascending (Menaik: Ringan ke Berat)
        Collections.sort(daftarPemain, new Comparator<DataType>() {
            public int compare(DataType a, DataType b) {
                return a.beratBadan - b.beratBadan;
            }
        });
        System.out.println("\n[BB Ascending/Menaik]:");
        for (DataType pemain : daftarPemain) {
            System.out.println(pemain);
        }

        // Descending (Menurun: Berat ke Ringan)
        Collections.sort(daftarPemain, new Comparator<DataType>() {
            public int compare(DataType a, DataType b) {
                return b.beratBadan - a.beratBadan;
            }
        });
        System.out.println("\n[BB Descending/Menurun]:");
        for (DataType pemain : daftarPemain) {
            System.out.println(pemain);
        }
    }
}
