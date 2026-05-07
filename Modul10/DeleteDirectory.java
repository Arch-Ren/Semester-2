import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        var directory = new File("Modul10/DeleteTest");
        if (directory.isDirectory()) {
            File fileList[] = directory.listFiles();
            if (fileList != null) {
                for (File x : fileList) {
                    x.delete();
                }
            }
            directory.delete();
            System.out.println("Directory berhasil dihapus");
        } else {
            System.out.println("Directory tidak ditemukan");
        }
    }
}
