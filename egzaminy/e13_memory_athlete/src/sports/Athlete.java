package sports;

import java.util.Arrays;
import java.util.Comparator;

public class Athlete {
    String name;
    String nationality;
    Double[] records;


    public Athlete(String name, String nationality, Double[] records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", records=" + Arrays.toString(records) +
                '}' + "\n";
    }

}

class RecordComparator implements Comparator<Athlete> {

    @Override
    public int compare(Athlete o1, Athlete o2) {

        double najmniejszy1 = findBest(o1.records);
        double najmniejszy2 = findBest(o2.records);

        return Double.compare(najmniejszy1, najmniejszy2);
    }

    public double findBest(Double[] records)
    {
        Double wynik = records[0];

        for(int i = 1; i<records.length; i++)
        {
            if(records[i] < wynik)
            {
                wynik = records[i];
            }
        }
        return wynik;
    }
}

class NationalityNameComparator implements Comparator<Athlete>
{

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.nationality.compareTo(o2.nationality)==0)
        {
            return o1.name.compareTo(o2.name);
        }
        return o1.nationality.compareTo(o2.nationality);
    }
}