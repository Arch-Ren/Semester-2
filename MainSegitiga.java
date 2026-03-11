package Semester2;

public class MainSegitiga {
    public static void main (String[] args) {
        Segitiga segitiga1 = new Segitiga();
        Segitiga segitiga2 = new Segitiga(10, 5);

        System.out.println(segitiga1.alas);
        System.out.println(segitiga2.alas);
        System.out.println(segitiga1.nama); //null tidak menunjuk ke referensi manapun mau itu alamat untuk referensi atau nilai untuk primitif


        Segitiga a = new Segitiga(10, 10);
            //a adalah variabel bertipe references, menyimpan alamat memori bukan nilai seperti tipe data primitif
            //stack memori dan heap memory
        Segitiga b = new Segitiga(6, 10);
        Segitiga c = new Segitiga(8, 10);
        
        b = a;    //membuat atribut b mengikuti a. b menunjuk ke alamat a. menghapus alamat yang sebelumnya dirujuk oleh b.
        b.alas = 20;    //alas a mengikuti b. kesimpulan, atribut b selalu sama dengan a
        a.alas = 40;
        
        System.out.println(a.hitungLuas());
        System.out.println(b.hitungLuas());
        System.out.println(c.hitungLuas());
    }
}
