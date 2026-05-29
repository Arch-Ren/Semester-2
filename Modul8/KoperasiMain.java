package Modul8;

public class KoperasiMain {
    public static void main(String[] args) {
        Invoice[] invoices = new Invoice[] {
                new Invoice("Buku", 100, 20000),
                new Invoice("Samsung Galaxy Note 50 Max Ultra", 1, 3000000),
                new Invoice("Steam Item: My Mom Is a ********", 5, 50000)
        };

        Employee E1 = new Employee(1, "Jason", 10000000, invoices);

        System.out.println("============================================================");
        System.out.println("              SLIP GAJI KOPERASI NV. MENEER                ");
        System.out.println("============================================================");
        System.out.printf("  No. Registrasi  : %d%n", E1.getRegistrationNumber());
        System.out.printf("  Nama Karyawan   : %s%n", E1.getName());
        System.out.printf("  Gaji Per Bulan  : Rp. %,.2f%n", E1.getSalaryPerMonth());

        System.out.println("------------------------------------------------------------");
        System.out.println("  Detail Belanjaan Koperasi:");
        System.out.println("------------------------------------------------------------");

        Payable[] payables = E1.getInvoices();
        for (Payable p : payables) {
            System.out.println(p.toString());
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("  %-35s Rp. %,.2f%n", "Total Tagihan Koperasi :", E1.getTotalInvoice());
        System.out.println("============================================================");
        System.out.printf("  %-35s Rp. %,.2f%n", "Gaji Bersih :", E1.getPayableAmount());
        System.out.println("============================================================");
    }
}
