package Modul11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<DataType> daftarPemain = DataTim.ambilDataMentah();

        List<Integer> tbTimA = new ArrayList<>();
        List<Integer> bbTimA = new ArrayList<>();
        List<Integer> tbTimB = new ArrayList<>();
        List<Integer> bbTimB = new ArrayList<>();

        for (DataType p : daftarPemain) {
            if (p.namaTim.equals("Tim A")) {
                tbTimA.add(p.tinggiBadan);
                bbTimA.add(p.beratBadan);
            } else if (p.namaTim.equals("Tim B")) {
                tbTimB.add(p.tinggiBadan);
                bbTimB.add(p.beratBadan);
            }
        }

        int jumlah168 = Collections.frequency(tbTimB, 168);
        int jumlah160 = Collections.frequency(tbTimB, 160);

        System.out.println("- Pemain di Tim B dengan TB 168 cm: " + jumlah168 + " orang");
        System.out.println("- Pemain di Tim B dengan TB 160 cm: " + jumlah160 + " orang");

        System.out.println();

        int jumlah56 = Collections.frequency(bbTimA, 56);
        int jumlah53 = Collections.frequency(bbTimA, 53);

        System.out.println("- Pemain di Tim A dengan BB 56 kg: " + jumlah56 + " orang");
        System.out.println("- Pemain di Tim A dengan BB 53 kg: " + jumlah53 + " orang");

        System.out.println();

        boolean tidakAdaTbSama = Collections.disjoint(tbTimA, tbTimB);
        if (tidakAdaTbSama) {
            System.out.println("Tidak ada pemain dari kedua tim dengan tinggi badan yang sama");
        } else {
            System.out.println("Ada pemain dari kedua tim dengan tinggi badan yang sama");
        }

        System.out.println();

        boolean tidakAdaBbSama = Collections.disjoint(bbTimA, bbTimB);
        if (tidakAdaBbSama) {
            System.out.println("Tidak ada pemain dari kedua tim dengan berat badan yang sama");
        } else {
            System.out.println("Ada pemain dari kedua tim dengan berat badan yang sama");
        }
    }
}