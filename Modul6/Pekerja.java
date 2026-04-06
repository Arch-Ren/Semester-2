import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, int year, int month, int date, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(year, month, date);
        this.jumlahAnak = jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return this.gaji;
    }

    public LocalDate getTahunMasuk() {
        return this.tahunMasuk;
    }

    public int getJumlahAnak() {
        return this.jumlahAnak;
    }

    public double getBonus() {
        int lamaBekerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if (lamaBekerja > 5 && lamaBekerja <= 10) {
            return 0.10 * gaji;
        } else if (lamaBekerja > 10) {
            return 0.15 * gaji;
        } else {
            return 0.0;
        }
    }
    
    @Override
    public double getPendapatan() {
        return super.getTunjangan() + (jumlahAnak * 20.0) + gaji + getBonus();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        String.format(
            "Tahun Masuk   : %s\n" +
            "Jumlah Anak   : %d\n" +
            "Gaji          : $%.1f",
            tahunMasuk, jumlahAnak, gaji
        );
    }
}
