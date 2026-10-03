import java.util.Objects;

public class Musician {
    public String name;
    public String brandName;

    Musician(){}
    Musician(String name, String brandName) {
        this.name = name;
        this.brandName = brandName;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return Objects.equals(name, musician.name) && Objects.equals(brandName, musician.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brandName);
    }

    public StringBuilder writeSong(int n){
        StringBuilder d1 = new StringBuilder();
        for(int i = 0; i < n; i++)
        {
            d1.append("la");
        }
        return d1;
    }
}

class Guitarist extends Musician{
    public String guitarModel;

    Guitarist(){}
    Guitarist(String name, String brandName, String guitarModel) {
        super(name, brandName);
        this.guitarModel = guitarModel;
    }

    @Override
    public String toString() {
        return "Guitarist{" +
                ", name='" + name + '\'' +
                ", brandName='" + brandName + '\'' +
                ", guitarModel='" + guitarModel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guitarist guitarist = (Guitarist) o;
        return Objects.equals(guitarModel, guitarist.guitarModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), guitarModel);
    }
    public StringBuilder writeSong(){
        int n = 4;
        StringBuilder d1 = new StringBuilder();
        for(int i = 1; i < n + 1; i++)
        {
            if(i % 2 == 0)
            {
                d1.append("LA");
            }
            else
            {
                d1.append("la");
            }
        }
        return d1;
    }
}