package kolos1;

public record Person(String name, Integer age) {
    public Person {
        if(age < 0)
            age = 0;
    }

    public boolean czyPełnolietni()
    {
        return age >= 18;
    }

}
