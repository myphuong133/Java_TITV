package java61_quan_ly_sv;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    String studentCode, fullName;

    public int yearBirth;

    float averageSubject;
    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public float getAverageSubject() {
        return averageSubject;
    }

    public Student(String studentCode, String fullName, int yearBirth, float averageSubject) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.yearBirth = yearBirth;
        this.averageSubject = averageSubject;
    }



    @Override
    public String toString() {
        return "Mã sinh viên: " + studentCode + "||"
                + "Họ và tên: " + fullName + " || "
                + "Năm sinh: " + yearBirth + " || "
                + " Điểm trung bình: " + averageSubject;
    }

    public void setAverageSubject(float averageSubject) {
        this.averageSubject = averageSubject;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.averageSubject - o2.averageSubject);
    }
}
