package Modul11;

import java.util.ArrayList;
import java.util.List;

public class DataTim {
    public static List<DataType> ambilDataMentah() {
        List<DataType> daftarPemain = new ArrayList<>();
        
        // Data Tim A
        daftarPemain.add(new DataType("Tim A", 1, 168, 50));
        daftarPemain.add(new DataType("Tim A", 2, 170, 60));
        daftarPemain.add(new DataType("Tim A", 3, 165, 55));
        daftarPemain.add(new DataType("Tim A", 4, 168, 55));
        daftarPemain.add(new DataType("Tim A", 5, 172, 60));
        daftarPemain.add(new DataType("Tim A", 6, 170, 70));
        daftarPemain.add(new DataType("Tim A", 7, 169, 66));
        daftarPemain.add(new DataType("Tim A", 8, 165, 56));
        daftarPemain.add(new DataType("Tim A", 9, 171, 72));
        daftarPemain.add(new DataType("Tim A", 10, 166, 56));
        
        // Data Tim B
        daftarPemain.add(new DataType("Tim B", 1, 170, 66));
        daftarPemain.add(new DataType("Tim B", 2, 167, 60));
        daftarPemain.add(new DataType("Tim B", 3, 165, 59));
        daftarPemain.add(new DataType("Tim B", 4, 166, 58));
        daftarPemain.add(new DataType("Tim B", 5, 168, 58));
        daftarPemain.add(new DataType("Tim B", 6, 175, 71));
        daftarPemain.add(new DataType("Tim B", 7, 172, 68));
        daftarPemain.add(new DataType("Tim B", 8, 171, 68));
        daftarPemain.add(new DataType("Tim B", 9, 1768, 65));
        daftarPemain.add(new DataType("Tim B", 10, 169, 60));
        
        return daftarPemain;
    }
}
