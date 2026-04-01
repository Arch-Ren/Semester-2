public class student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    public student(){
        name = "";
        address = "";
        age = 0;
    }
    public student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public student(String nama, String alamat, int umur, int NMatematika, int NInggris, int NScience) {
        name = nama;
        address = alamat;
        age = umur;
        mathGrade = NMatematika;
        englishGrade = NInggris;
        scienceGrade = NScience;
    }

    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setMath(int math){
        mathGrade = math;
    }
    public void setEnglish(int english){
        englishGrade = english;
    }
    public void setScience(int science){
        scienceGrade = science;
    }
    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        average = result;
        return result;
    }

    private boolean statusAkhir (double average) {
        if(average >= 61) {
            return true;
        } else {
            return false;
        }
    }

    public void tampilkanJumlahObjek (int jumlahObjek) {
        System.out.println("Jumlah objek yang telah dibuat: " + jumlahObjek);
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        System.out.println("Status akhir siswa " + (statusAkhir(average)? "Lolos" : "Remidi") + " dengan nilai " + average);
        System.out.println("==========");
    }
 }