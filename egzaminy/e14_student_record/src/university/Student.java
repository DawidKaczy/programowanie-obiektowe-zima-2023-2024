package university;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student> {


    @Override
    public int compareTo(Student o) {
        if(Double.compare(o.averageGrade, averageGrade)==0)
        {
            return Double.compare(yearOfStudy, o.yearOfStudy);
        }
        return Double.compare(o.averageGrade, averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfStudy=" + yearOfStudy +
                '}' + "\n";
    }
}
