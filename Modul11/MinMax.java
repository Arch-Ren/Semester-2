package Modul11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<DataType> daftarPemain = DataTim.ambilDataMentah();
        
        // Pisahkan data per tim terlebih dahulu
        List<DataType> timA = new ArrayList<>();
        List<DataType> timB = new ArrayList<>();
        for (DataType p : daftarPemain) {
            if (p.namaTim.equals("Tim A"))
                timA.add(p);
            if (p.namaTim.equals("Tim B"))
                timB.add(p);
        }

        System.out.println("\n[Analisis Tim A]:");
        cetakMaxMin(timA);

        System.out.println("\n[Analisis Tim B]:");
        cetakMaxMin(timB);
    }

    private static void cetakMaxMin(List<DataType> tim) {
        if (tim.isEmpty())
            return;

        DataType tbMin = Collections.min(tim, (a, b) -> a.tinggiBadan - b.tinggiBadan);
        DataType tbMax = Collections.max(tim, (a, b) -> a.tinggiBadan - b.tinggiBadan);

        DataType bbMin = Collections.min(tim, (a, b) -> a.beratBadan - b.beratBadan);
        DataType bbMax = Collections.max(tim, (a, b) -> a.beratBadan - b.beratBadan);

        System.out.println("  - TB Maksimum: " + tbMax.tinggiBadan + " cm (Pemain " + tbMax.noPemain + ")");
        System.out.println("  - TB Minimum : " + tbMin.tinggiBadan + " cm (Pemain " + tbMin.noPemain + ")");
        System.out.println("  - BB Maksimum: " + bbMax.beratBadan + " kg (Pemain " + bbMax.noPemain + ")");
        System.out.println("  - BB Minimum : " + bbMin.beratBadan + " kg (Pemain " + bbMin.noPemain + ")");
    }
}
