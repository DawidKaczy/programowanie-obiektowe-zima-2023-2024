package zad1_person_record;

public record Person(String name, int age) {
    public Person{
        if(age<0)
        {
            age = 0;
        }
    }
    public boolean isAdult(){
        return age>=18;
    }
}
