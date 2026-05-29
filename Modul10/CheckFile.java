import java.io.File;

public class CheckFile {
    public static void main(String[] args) {
        var file = new File("Modul10/checkSize.txt");
        long size = file.length() / 1000;
        if (size < 1000) {
            System.out.println("Ukuran filenya adalah " + size + " KB");
        } else {
            System.out.println("Ukuran filenya adalah " + size / 1000 + " MB");
        }
    }
}
