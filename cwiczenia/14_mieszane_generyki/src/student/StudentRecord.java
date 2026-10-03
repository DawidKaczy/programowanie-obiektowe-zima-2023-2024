package student;

public class StudentRecord {
    String name;
    String id;
    double gpa;

    public StudentRecord(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        if(gpa < 0.0 || gpa > 4.0)
        {
            throw new IllegalArgumentException("Błędne dane");
        }
        else
        {
        this.gpa = gpa;
        }
    }

    public boolean  isHonorStudent()
    {
        return gpa > 3.5;
    }

    public String printDetails() {
        return "StudentRecord{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
