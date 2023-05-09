package java68_file_simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public Main (String fileName){
        
    }
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\java68_file_simple\\Folder1\\Folder2\\Folder1");
        File file2 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\java68_file_simple\\Folder1\\Folder2\\Folder2");
        File file3= new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\java68_file_simple\\Folder1\\Folder2\\Folder3");
        File file1 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\java68_file_simple\\Folder1\\Folder2\\Folder2\\File.txt");
        File file4 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src");


        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println(
                    "MENU ----------------" + "\n" +
                    "1. Kiểm tra xem file có thể thực thi" + "\n" +
                    "2. Kiểm tra xem file có thể đọc: " + "\n" +
                    "3. Kiểm tra xem file có thể ghi: " + "\n" +
                    "4. In đường dẫn" + "\n" +
                    "5. In tên file" + "\n" +
                    "6. Kiểm tra xem file là thư mục hay tập tin" + "\n" +
                    "7. In ra danh sách các file con" + "\n" +
                    "8. In ra cây thư mục" + "\n"
            );
            option = sc.nextInt();
            switch (option){
                case 1:
                    if (file1.canExecute()) {
                        System.out.println("Có thể thực thi");
                    }
                    else {
                        System.out.println("Không th thực thi");
                    }
                    break;
                case 2:
                    if (file1.canRead()){
                        System.out.println("Có thể đọc");
                    }
                    else {
                        System.out.println("Không thể đọc");
                    }
                    break;
                case 3:
                    if (file1.canWrite()){
                        System.out.println("Có thể ghi đè");
                    }
                    else {
                        System.out.println("Không thể ghi đè");
                    }
                    break;
                case 4:
                    System.out.println(file.getPath());
                    break;
                case 5:
                    System.out.println(file.getName());
                    break;
                case 6:
                    if (file.isFile()){
                        System.out.println("Là File");
                    } else if (file.isDirectory()) {
                        System.out.println("Là thư mục");
                    }
                    else {
                         System.out.println("Không rõ");
                    }
                    break;
                case 7:
                    printSubFile(file4);
                    break;
                case 8:
                    printStackTree(file4,0);
                    break;
            }
        } while (option!= 0);
    }
    public static void printSubFile(File file){
        if (file.isDirectory()){
            System.out.println(file.getName());
            File[] files = file.listFiles();
            for (File f:
                 files) {
                System.out.println("\t" + f.getName());
            }
        }
        else {
            System.out.println("Đây là tệp nên không thể có tệp con");
        }
    }
    public static void printStackTree(File file, int level){
            String tab = "";
            for (int i =0;i < level; i++){
                tab+= "\t";
            }
            if ( file.isDirectory()){
                System.out.println(tab + file.getName());
                File[] files = file.listFiles();
               for (File f:
                    files) {
                   printStackTree(f,level + 1);
               }
           } else {

               System.out.println(tab + file.getName());
           }
    }
}
