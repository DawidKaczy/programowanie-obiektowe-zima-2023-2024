import java.util.Objects;

public class School
{
    public String name;
    public String address;
    public int students;

    public School(String name, String address, int students) {
        if (name != null && !name.isEmpty())
        {
            this.name = name;
        }
        else
        {
            this.name = "Wydział Matematyki i Informatyki UWM";
        }
        if(address != null && !address.isEmpty())
        {
            this.address = address;
        }
        else
        {
            this.address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        if(students < 0) {
            this.students = 100;
        }
        else
        {
            this.students = students;
        }
    }
    public String toString()
    {

        String className = getClass().getName();
        return className + ": " + "Name: " + this.name + ". " + "Address: " + this.address + ". " + "Number of students: " + this.students + ". ";
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof School)
        {
            School szkola = (School)obj;
            return(Objects.equals(this.address, szkola.address));
        }
        return false;
    }
    public void recruitment(int argument)
    {
        int wynik =  this.students += argument;
        if(wynik > 500)
        {
             this.students = 500;
        }
        else
        {
             this.students = wynik;
        }
    }
    public static void checkLimit(School school) {
        int currentStudents = school.students;
        int remainingSeats = 500 - currentStudents;

        System.out.println("Ilośc studentów: " + currentStudents);
        System.out.println("wolne miejsca: " + remainingSeats);
    }
}
class University extends School{

    public String type;
    public int studies;
    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        if (type != null && !type.isEmpty())
        {
            this.type = name;
        }
        else
        {
            this.type = "university of technology";
        }
        if(studies < 0)
        {
            this.studies = 10;
        }
        else
        {
            this.studies = studies;
        }
    }
    public String toString()
    {
        String className = getClass().getName();
        return className + ": "
                + "Name: " + super.name + ". "
                + "Address: " + super.address + ". "
                + "Number of students: " + super.students + ". "
                + "Type: " + this.type + ". "
                + "Number of studies: " + this.studies + ". ";
    }

    @Override
    public void recruitment(int arg)
    {
        int wynik =  super.students += arg;
        if(wynik > 500)
        {
            super.students = 500;
        }
        else
        {
            super.students = wynik;
        }
        this.studies += studies / 10;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof University)
        {
            University university = (University)obj;
            return(Objects.equals(super.address, university.address) && this.studies == university.studies);
        }
        return false;
    }


}

