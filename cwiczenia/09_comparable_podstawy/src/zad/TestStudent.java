package zad;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,2.0));
        studentList.add(new Student(4,9.0));
        studentList.add(new Student(3,3.0));
        studentList.add(new Student(2,6.0));
        studentList.add(new Student(7,8.0));

        System.out.println(studentList);
//Collections.sort(studentList, new StudentAverageGradeComperatior());
        studentList.sort(new StudentAverageGradeComperatior());


        ArrayList<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student(6,2.0));
        studentList2.add(new Student(4,9.0));
        studentList2.add(new Student(4,3.0));
        studentList2.add(new Student(8,6.0));
        studentList2.add(new Student(4,8.0));

//Collections.sort(studentList2, new StudentAverageGradeComperatior());
        studentList2.sort(new AverageGradeComperatior());

        System.out.println(studentList);
        System.out.println(studentList2);

        Student s1 = new Student("Lucian", 3, 4.0);
        //Student s2 = (Student) s1.clone();

        //System.out.println(s1 + " " + s2);

        //s2.averageGrade = 3.0;
        //s2.name = "Łucja";

       // System.out.println(s1 + " " + s2);
    }
}
