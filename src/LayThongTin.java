import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class LayThongTin {
    File file;

    public LayThongTin(String fileName) {
        this.file = new File(fileName);
    }

    public boolean checkExecute(){
        return this.file.canExecute();
    }
    public boolean checkRead(){
        return this.file.canRead();
    }
    public boolean checkWrite(){
        return this.file.canWrite();
    }

    public String takePath(){
        return this.file.getAbsolutePath();
    }

    public String fileName(){
        return this.file.getName();
    }

    public String check(){
        if (this.file.isDirectory()){
            return "Đây là thư mục";
        } else if (this.file.isFile()) {
            return "Đây là file";
        }
        return null;
    }

    public void printThisChildren(){
        File[] childrenFile = this.file.listFiles();
        for (File file: childrenFile){
            System.out.println(file.getName());
        }
       }
       public void printChildren(){
            this.printDetail(this.file,1);
       }

     public void printDetail(File f,int level){
        for (int i=0;i< level;i++){
            System.out.println("\t");
            System.out.print(f.getName());


            if (f.canRead() && f.isDirectory()){
                File[] chirlList = f.listFiles();
                for (File fx: chirlList){
                    printDetail(fx, level+1);
                }
            }
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        String fileName  = "C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java67_File_Folder\\Directory_1";
        System.out.println(fileName);
        LayThongTin file1 = new LayThongTin(fileName);

        do{
            System.out.println("-----MENU------" +"\n"
                + "(1). Kiểm tra file có thể thực thi:" + "\n"
                + "(2). Kiểm tra file có thể đọc:" + "\n"
                + "(3). Kiểm tra file có thể ghi:" + "\n"
                + "(4). In đường dẫn:" + "\n"
                + "(5). In tên file:" + "\n"
                + "(6). Kiểm tra file là thư mục hoặc tập tin: " + "\n"
                + "(7). In ra danh sách các file con: " + "\n"
                + "(8). In ra cây thư mục: " + "\n"
                + "(0). Thoát chương trình: " + "\n"

            );
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println(file1.checkExecute());
                    break;
                case 2:
                    System.out.println(file1.checkRead());
                    break;
                case 3:
                    System.out.println(file1.checkWrite());
                    break;
                case 4:
                    System.out.println(file1.takePath());
                    break;
                case 5:
                    System.out.println(file1.fileName());
                    break;
                case 6:
                    System.out.println(file1.check());
                    break;
                case 7:
                    file1.printThisChildren();
                    break;
                case 8:
                    file1.printChildren();
                    break;
            }

        }while (option != 0);
    }
}
