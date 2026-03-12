package Semester2.AkunBank;

public class Akun {
    private String username;    //minimal 4 huruf
    private String noRek;       //minimal 8 huruf/karakter
    private String password;    //minimal 8 karakter harus ada underscore dan 1 uppercase
    private int saldo = 0;      //tidak boleh minus, tambah saldo harus masukkan password

    public Akun(){
        username = null;
        noRek = null;
        password = null;
        saldo = 0;
    };

    public Akun(String username, String noRek, String password, int saldo) {
        this.username = username;
        this.noRek = noRek;
        this.password = password;
        this.saldo = saldo;
    }

    public String getUsername() {
        return username;
    }
    public String getNoRek() {
        return noRek;
    }
    public String getPassword() {
        return password;
    }
    public int getSaldo() {
        return saldo;
    }

    public void setUsername(String username) {
        String[] cekNama = username.split("");
        if(cekNama.length < 4) {
            System.out.println("Username harus memiliki minimal 4 huruf");
            return;
        }
        this.username = username;
    }
    public void setNoRek(String noRek) {
        String[] cekNoRek = noRek.split("");
        if(cekNoRek.length < 8) {
            System.out.println("Nomer Rekening harus memiliki minimal 8 karakter");
            return;
        }
        this.noRek = noRek;
    }
    public void setPassword(String password) {
        char[] cekPassword = password.toCharArray();
        boolean punyaHurufBesar = false;
        boolean punyaUnderScore = false;
        for(char karakter : cekPassword) {
            if(karakter == '_') {
                punyaUnderScore = true;
            }
            if(karakter >= 'A' && karakter <= 'Z') {
                punyaHurufBesar = true;
            }
        }
        if(cekPassword.length < 8) {
            System.out.println("Password harus memiliki minimal 8 karakter");
            return;
        } else if (!punyaHurufBesar && !punyaUnderScore) {
            System.out.println("Password harus memiliki setidaknya 1 huruf besar dan 1 underscore");
            return;
        } else if(!punyaHurufBesar) {
            System.out.println("Password harus memiliki setidaknya 1 huruf besar");
            return;
        } else if(!punyaUnderScore) {
            System.out.println("Password harus memiliki setidaknya 1 underscore");
            return;
        }
        this.password = password;
    }

    public void setSaldo(int saldo) {
        if(saldo < 0) {
            System.out.println("Saldo tidak boleh minus!");
        }
        this.saldo = saldo;
    }

    public void tambahSaldo(int jumlah, String password) {
        if(!password.equals(this.password)) {
            System.out.println("Password salah! Silahkan ulangi transaksi!");
            return;
        }
        System.out.println("Saldo berhasil ditambahkan!");
        saldo += jumlah;
    }

    public void tarikSaldo(int jumlah, String password) {
        if(!password.equals(this.password)) {
            System.out.println("Password salah! Tidak dapat melakukan transaksi!");
            return;
        }
        if(jumlah > this.saldo) {
            System.out.println("Saldo tidak cukup. Transaksi gagal!");
            return;
        }
        this.saldo -= jumlah;
        System.out.println("Penarikan saldo berhasil. Sisa saldo sekarang: " + this.saldo);
    }
}
