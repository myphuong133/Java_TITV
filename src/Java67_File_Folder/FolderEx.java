package Java67_File_Folder;
import java.io.File;
import java.io.IOException;

public class FolderEx {
    public static void main(String[] args) {
        File folder1 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder");
        System.out.println("Check file: " + folder1.exists());

    // tạo một thư mục
     File d1 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder\\Directory_1");
     d1.mkdir();

     //Tạo nhiều thư mục
        File d2 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder\\Directory_1\\Directory_2\\Directory_3\\Directory_4\\Directory_5");
    d2.mkdirs();

    // Tạo file
        File file1 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder\\Directory_1\\Example1.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
        //không có quyền tạo tập tin
//        Ổ cứng bị đầy
//        Đường dẫn sai
            throw new RuntimeException(e);
        }


    }
}
