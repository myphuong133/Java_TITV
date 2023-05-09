package java61_quan_ly_sv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st1 = new Student("110001", "C", 2004, 9);
        Student st2 = new Student("110002", "B", 2008, 8);
        Student st3 = new Student("110003", "A", 2004, 5);

        // Test tự tạo danh sách
        Student[] ste = new Student[]{st1,st2,st3};
        studentList studentList = new studentList();
        for (Student st : ste){
            studentList.addStudent(st);
        }

        // Test tự so sánh bằng comparator
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        //------------------------------------------------------------

        int userOption = 0;
        do {
            System.out.println("----------------MENU-----------------" + "\n" +
                    "Mời chọn phương thức" + "\n" +
                    "1. Thêm sinh viên vào danh sách" + "\n" +
                    "2. Xem số lượng dinh viên trong danh sách" + "\n" +
                    "3. Xoá toàn bộ danh sách" + "\n" +
                    "4. Tìm kiếm sinh viên" + "\n" +
                    "5. Xoá 1 sinh viên" + "\n" +
                    "6. Sắp xếp danh sách từ cao đến thấp"
            );
            userOption = sc.nextInt();
            sc.nextLine();
            switch (userOption) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String studentCode = sc.nextLine();
                    System.out.println("Nhập họ và tên sinh viên:");
                    String fullName = sc.nextLine();
                    System.out.println("Nhập năm sinh sinh viên");
                    int yearBirth = sc.nextInt();
                    System.out.println("Nhập diểm trung bình");
                    int averageSubject = sc.nextInt();
                    Student studentToAdd = new Student(studentCode, fullName, yearBirth, averageSubject);
                    studentList.addStudent(studentToAdd);
                    break;

                case 2:
                    System.out.println("Cách 1 tự làm");
                    int studentListLength = studentList.checkSize();
                    if (studentListLength == 0) {
                        System.out.println("Danh sách rỗng");
                    } else {
                        System.out.println("Danh sách hiện tại có " + studentListLength + " bạn");
                    }
                    System.out.println("Cách 2 dùng is Empty");
                    System.out.println(studentList.checkEmpty());
                    break;

                case 3:
                    studentList.emptyArray();
                    break;

                case 4:
                    System.out.println("------------Tìm kiếm...");
                    int findOption;
                    System.out.println("Chọn phương thúc bạn muốn tìm kiếm"+ "\n" +
                            "1. Theo MSV" + "\n" +
                            "2. Theo tên " + "\n" +
                            "3. Theo năm sinh" + "\n"
                            );
                    findOption = sc.nextInt();
                    sc.nextLine();
                    switch (findOption){
                        case 1:
                            System.out.println("Hãy nhập mã sinh viên bạn muốn tìm");
                            String studentCodeToFind;
                            studentCodeToFind = sc.nextLine();
                            System.out.println("Danh sách sinh viên: ");
                            studentList.findStudentWithCode(studentCodeToFind);
                            break;
                        case 2:
                            System.out.println("Hãy tên sinh viên bạn muốn tìm");
                            String name;
                            name = sc.nextLine();
                            System.out.println("kết quả tìm kiếm: ");
                            studentList.findStudentWithName(name);
                            break;
                        case 3:
                            System.out.println("Nập năm sinh vinh viên: ");
                            int studentYearBirthToFind;
                            studentYearBirthToFind = sc.nextInt();
                            System.out.println("Kết quả tìm kiếm: ");
                            studentList.findStudentWithYearBirth(studentYearBirthToFind);
                    }
                    break;
                case 6:
//                    Đây là kết quả so sánh :v
//                    System.out.println(Arrays.deepToString(al.toArray()));
//                    Collections.sort(al,new compa());
//                    System.out.println(Arrays.deepToString(al.toArray()));
//                    break;
                    studentList.sortDescending();
                    break;
                case 5:
                    int index = studentList.checkSize();
                    System.out.println(index);
                    System.out.println(studentList.checkSize());
                    System.out.println("Nhập vị trí muốn xoá");
                    index = sc.nextInt() - 1;
                    studentList.removeStudent(index);
                    break;

                case 7:
                    break;
            }

            // Đây là cách in bằng toString
            /**System.out.println(studentList.toString());*/

            // Đây là sử dụng hàm void nhưng nếu muốn kết quả trả về cũng đươc
            System.out.println("----------------Danh sách sinh viên----------------");
            studentList.printStudentList();


        } while (userOption != 0);

        st1.getStudentCode();
    }


}
