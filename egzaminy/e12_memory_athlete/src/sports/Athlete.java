package sports;

import java.util.Arrays;
import java.util.Comparator;

public class Athlete {
    String name;
    String nationality;
    double[] records;

    public Athlete(String name, String nationality, double[] records) {
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
                '}'+ "\n";
    }
}

class RecordComparator implements Comparator<Athlete>
{
    @Override
    public int compare(Athlete o1, Athlete o2) {

        double wynik1 = najLepszy(o1.records);
        double wynik2 = najLepszy(o2.records);

        return Double.compare(wynik1,wynik2);
    }

    public double najLepszy(double[] tab)
    {
        double wynik = tab[0];
        for(int i = 1; i < tab.length; i++)
        {
            if(tab[i] < wynik)
            {
                wynik = tab[i];
            }
        }
        return wynik;
    }
}

class NationalityNameComparator implements Comparator<Athlete>
{

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.nationality.compareTo(o2.nationality) == 0)
        {
            return o1.name.compareTo(o2.name);
        }
        return o1.nationality.compareTo(o2.nationality);
    }
}
