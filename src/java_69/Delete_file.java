package java_69;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class Delete_file{

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Delete_file(File file) {
        this.file = file;
    }
    // In ra cây thư mục

    public void takePath(File file, int level){
        if(file.isDirectory()){
            System.out.println(getPadding(level) + "- " + file.getName());
            File[] children = file.listFiles();
            for (File f: children) {
                this.takePath(f, level+1);
            }
        }
        else {
            System.out.println(getPadding(level) + "+ " + file.getName());
        }
    }
    public String getPadding(int level){
        String result = "";
        for (int i =0 ; i < level; i++){
            result+= "\t";
        }
        return result;
    }
    // Xoá thư mục
    public void deleteFile(File file){
        file.delete();
    }
    public void deleteAllFile(File file){
        if (file.isFile()){
            Path path = file.toPath();
            try {
                Files.deleteIfExists(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else if (file.isDirectory()){
            File[] children = file.listFiles();
            for (File f:
                 children) {
                deleteAllFile(f);
            }
            Path path = file.toPath();
            try {
                Files.deleteIfExists(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {

        File f0 = new File("D:\\FFOutput");
        File f1 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder\\Directory_1");
        File f2 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder\\Directory_2");

       f1.renameTo(f2);



    }
 }

