public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(int i){
        kecepatan = rubahKecepatan(i);    
    }

    public void setWaktu(double d){
        waktu = rubahSekon(d);
    }

    private double rubahSekon(double d) {
        double sekon = d * 3600;
        return sekon; 
    }

    private int rubahKecepatan(int i) {
        int kecepatan = i;
        return (kecepatan * 5 / 18);
    }

    public double hitungJarak(int kecepatan, double waktu) {
        double jarak = kecepatan * waktu;
        jarak /= 1000;
        return jarak;
    }
        
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("Waktu tempuh kendaraan " + waktu + " detik");
        System.out.println("Jarak yang ditempuh : " + hitungJarak(kecepatan, waktu) + "Km");
    }
        
}