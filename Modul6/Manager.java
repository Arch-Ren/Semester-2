public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int year, int month,
            int date, int childNumber, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, year, month, date, childNumber);
        this.departemen = departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return this.departemen;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.10 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
            "Departemen    : " + departemen;
    }
}
