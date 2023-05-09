package java61_quan_ly_sv;

import java.util.Comparator;
// Đây là phương thức so sánh comparator
public class compa implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        if (o1.averageSubject == o2.averageSubject){
            return 0;
        } else if (o1.averageSubject < o2.averageSubject) {
            return 1;
        } else {
            return -1;
        }
    }
}
