package academy;

import java.util.Arrays;

public class Student implements Cloneable{
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.grades = this.grades.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void zamiana(int element)
    {
        grades[0] = element;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
