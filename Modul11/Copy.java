package Modul11;

import java.util.ArrayList;
import java.util.List;

public class Copy {
    public static void main(String[] args) {
        List<DataType> daftarPemain = DataTim.ambilDataMentah();

        List<DataType> timB = new ArrayList<>();
        for (DataType p : daftarPemain) {
            if (p.namaTim.equals("Tim B"))
                timB.add(p);
        }

        List<DataType> timC = new ArrayList<>();

        for (DataType pemainB : timB) {
            DataType pemainBaruTimC = new DataType("Tim C", pemainB.noPemain, pemainB.tinggiBadan, pemainB.beratBadan);
            timC.add(pemainBaruTimC);
        }

        System.out.println("\nAnggota Tim C:");
        for (DataType pemain : timC) {
            System.out.println(pemain);
        }
    }
}
