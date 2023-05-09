package example;
public class java54_student implements Comparable<java54_student>{
    private int studentCode;
    private String fullName,className;
    private double averageScore;

    public java54_student(int studentCode, String fullName, String className, double averageScore) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.className = className;
        this.averageScore = averageScore;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getLastName(){
        String name = this.fullName.trim();
        name = name.substring(name.lastIndexOf(" ") + 1);
        return name;
    }

    public String toString(){
        return "Sinh viên [" + studentCode + "]," + "[" + fullName + "]," + "[" + className + "],"+ "[" + averageScore + "],";
    }
    @Override
    public int compareTo(java54_student o) {
        return this.studentCode - o.studentCode;
    }

}
