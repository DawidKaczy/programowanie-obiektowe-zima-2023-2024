package cafe;

import java.util.Comparator;

public record Beverage(String name, String barista, int strength) {


    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + name + '\'' +
                ", barista='" + barista + '\'' +
                ", strength=" + strength +
                '}'+ "\n";
    }
}

class StrengthNameComparator implements Comparator<Beverage>
{

    @Override
    public int compare(Beverage o1, Beverage o2) {
        if(Integer.compare(o1.strength(), o2.strength())== 0)
        {
            return o1.name().compareTo(o2.name());
        }
        return Integer.compare(o1.strength(), o2.strength());
    }
}
