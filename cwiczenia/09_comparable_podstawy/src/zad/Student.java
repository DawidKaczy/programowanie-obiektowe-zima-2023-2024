// interfejs Comparable && interfejs Comparator

package zad;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable{
    String name;
    int yerOfStudy;
    double averageGrade;

    public Student(String name, int yerOfStudy, double averageGrade) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yerOfStudy = yerOfStudy;
    }
    public Student(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    public Student(int yerOfStudy) {
        this.yerOfStudy = yerOfStudy;
    }
    public Student(int yerOfStudy, double averageGrade) {
        this.yerOfStudy = yerOfStudy;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "["+ name + " " + yerOfStudy + " " +averageGrade + "]";
    }

    @Override
    public int compareTo(Student o) {
        if(Double.compare(this.averageGrade, o.averageGrade)==0)
            return Integer.compare(this.yerOfStudy,o.yerOfStudy);
        return Double.compare(this.averageGrade, o.averageGrade);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class StudentAverageGradeComperatior implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.yerOfStudy, o2.yerOfStudy);
    }
}

class AverageGradeComperatior implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.averageGrade, o2.averageGrade);
    }
}
