import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("Modul10");
        File listFile[] = file.listFiles();
        System.out.println("Daftar file:");
        int i = 1;
        for (File b : listFile) {
            System.out.println(i + ". " + b.getName());
            i++;
        }
    }
}
