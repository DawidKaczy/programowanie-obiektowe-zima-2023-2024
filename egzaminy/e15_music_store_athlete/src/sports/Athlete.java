package sports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public record Athlete(String name, String sport, int yearOfAchievement) implements Comparable<Athlete> {

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", yearOfAchievement=" + yearOfAchievement +
                '}' + "\n";
    }

    @Override
    public int compareTo(Athlete o) {
        return Integer.compare(yearOfAchievement, o.yearOfAchievement);
    }
}
