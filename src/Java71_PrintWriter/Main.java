package Java71_PrintWriter;

import java61_quan_ly_sv.Student;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java71_PrintWriter\\File.txt");
        file.createNewFile();

        // Viết File
        PrintWriter printWriter = new PrintWriter(file);

        Student student = new Student("100111","Nguyễn Văn A",2004, 7.8F);
        printWriter.println("Wassap");
        printWriter.println();
        printWriter.println(student);
        printWriter.flush();
        printWriter.close();

        // Đọc file
        BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
        String line = "";
        int i = 0;
        boolean a =true;
        while (line != null){
            line = br.readLine();
            System.out.println(line);
        }
        // C2
        List<String> allLines = Files.readAllLines(file.toPath(),StandardCharsets.UTF_8);
        for (String l: allLines
             ) {
            System.out.println(l);
        }
        // Lưu đối tượng
        File file1 = new File("C:\\Users\\Admin\\IdeaProjects\\TITV 50\\src\\Java71_PrintWriter\\File1.data");

        OutputStream os = new FileOutputStream(file1);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(student);
        oos.flush();
        oos.close();

    }
}

