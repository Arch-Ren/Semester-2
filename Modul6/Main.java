public class Main {
    public static void main(String[] args) {

        // 1. Test class Manusia
        System.out.println("=== 1. Test Class Manusia ===");
        Manusia m1 = new Manusia("Jason", true, "1234567890123456", true);
        System.out.println(m1);
        System.out.println();

        Manusia m2 = new Manusia("Rei", false, "1234567890123456", true);
        System.out.println(m2);
        System.out.println();
        Manusia m3 = new Manusia("Habibub", true, "1234567890123456", false);
        System.out.println(m3);
        System.out.println("\n");

        // 2. Test class MahasiswaFILKOM
        System.out.println("=== 2. Test Class MahasiswaFILKOM ===");
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Braien", true, "1234567890123456", false, "253456789012345", 2.8);
        System.out.println(mhs1);
        System.out.println();

        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Hanif", true, "1234567890123456", false, "253456789012345", 3.2);
        System.out.println(mhs2);
        System.out.println();

        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Arfa", true, "1234567890123456", false, "253456789012345", 3.8);
        System.out.println(mhs3);
        System.out.println("\n");

        // 3. Test class Pekerja
        System.out.println("=== 3. Test Class Pekerja ===");
        Pekerja p1 = new Pekerja("Ambatukam", true, "1234567890123456", true, 1000, 2024, 1, 1, 2);
        System.out.println(p1);
        System.out.println();

        Pekerja p2 = new Pekerja("Arahii", true, "1234567890123456", false, 1000, 2017, 1, 1, 0);
        System.out.println(p2);
        System.out.println();

        Pekerja p3 = new Pekerja("Atsuka", false, "1234567890123456", true, 1000, 2006, 1, 1, 10);
        System.out.println(p3);
        System.out.println("\n");

        // 4. Test class Manager
        System.out.println("=== 4. Test Class Manager ===");
        Manager mgr = new Manager("Shinji", true, "1234567890123456", false, 7500, 2011, 1, 1, 0, "HRD");
        System.out.println(mgr);
    }
}