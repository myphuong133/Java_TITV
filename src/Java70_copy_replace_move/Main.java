package Java70_copy_replace_move;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1  = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory1\\File1");
        File f4  = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory1\\File1xyz.txt");
        File f2  = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory1\\File2.txt");
        File f5  = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory1\\File2_Copy.txt");
        File f6  = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory2\\File2_Copy.txt");
        File f3  = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory2\\File1.txt");
        File f7 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory1\\Sub");


        // Đổi tên
        f4.renameTo(f1);
        Files.move(f4.toPath(),f1.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // Di chuyển File
        Files.move(f1.toPath(),f3.toPath(), StandardCopyOption.REPLACE_EXISTING);

        //Copy
        Files.copy(f2.toPath(),f6.toPath(),StandardCopyOption.REPLACE_EXISTING);
        // CopyALl
        File FSrc = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory1\\File1");
        File FEnd = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java70_copy_replace_move\\Directory1\\Directory2\\File1_Copy");
        copyALl(FSrc,FEnd);
    }
    // CopyALlFile
    public static void copyALl(File f1,File f2) throws IOException {
        Files.copy(f1.toPath(),f2.toPath(),StandardCopyOption.REPLACE_EXISTING);
        if (f1.isDirectory()){
            File[] files = f1.listFiles();
            for (File f : files){
                File newFile = new File(f2.getAbsolutePath() + "\\" + f.getName());
                copyALl(f,newFile);
            }
        }
    }
}
