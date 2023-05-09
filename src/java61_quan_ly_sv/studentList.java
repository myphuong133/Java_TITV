package java61_quan_ly_sv;

import java.util.*;

public class studentList {
    private ArrayList<Student>  studentList = new ArrayList<Student>();

    public studentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    public studentList(){
        this.studentList = new ArrayList<Student>();
    }

    /** Ở đây sử dụng 2 cách đẻ in 1 chuỗi array obj ra màn hình*/
    @Override
    // To string để in ra màn hình
    public String toString() {
        return "" + studentList;
    }
    // Sử dụng hàm riêng
    public void printStudentList(){
        for (Student st:
             studentList) {
            System.out.println(st);
        }
    }

    public int checkSize(){
        return this.studentList.size();
    }
    // DÙng 2 cách
    public boolean emptyArray(){
        return this.studentList.removeAll(studentList);
    }
    public boolean checkEmpty(){
        return this.studentList.isEmpty();
    }

    public void addStudent(Student st){
        this.studentList.add(st);
    }
    public void findStudentWithName(String name){
        for (Student st: studentList ){
            if (st.getFullName().indexOf(name) >= 0){
                System.out.println(st.getFullName());
            }
        }
    }

    public void findStudentWithCode(String code){
        for (Student st: studentList ){
            if (st.getStudentCode().indexOf(code) >= 0){
                System.out.println(st);
            }
        }
    }
    public void findStudentWithYearBirth(int year){
        for (Student st: studentList){
            String yearString = Integer.toString(year);
            String yearBirth = Integer.toString(st.getYearBirth());
            if (yearBirth.indexOf(yearString) >= 0){
                System.out.println(st);
            }
        }
    }

    public void sortDescending(){
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.averageSubject == o2.averageSubject){
                    return 0;
                }
                else if (o1.averageSubject > o2.averageSubject){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        });
    }
    public void removeStudent(int index){

        studentList.remove(index);
    }


}
