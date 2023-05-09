import example.java54_student;
import java.util.Arrays;

public class java54_comparedto {
    public static void main(String[] args) {
        java54_student student_1 = new java54_student(116,"Thanh","Lớp 1",1);
        java54_student student_2 = new java54_student(111,"Vũ Thanh Hoa","Lớp 1",8);
        java54_student student_3 = new java54_student(112,"Lmao Quang","Lớp 1",10);

        System.out.println(student_1.compareTo(student_2));

        java54_student[] arrayStudent = new java54_student[]{student_1,student_2,student_3};

        System.out.println("Ban đầu: " + Arrays.toString(arrayStudent));
        Arrays.sort(arrayStudent);
        System.out.println("Sau khi sắp xếp: " + Arrays.toString(arrayStudent) );

        //Tìm kiếm
        System.out.println("TÌm kiếm sv" + Arrays.binarySearch(arrayStudent,student_1));

    }



}
