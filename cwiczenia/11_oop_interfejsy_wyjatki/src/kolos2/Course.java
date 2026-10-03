package kolos2;

public class Course implements Comparable<Course>{
    String name;
    int numberOfHoursl;
    double price;

    public Course(String name, int numberOfHoursl, double price) {
        this.name = name;
        this.numberOfHoursl = numberOfHoursl;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfHoursl=" + numberOfHoursl +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public int compareTo(Course o) {
        if(Integer.compare(numberOfHoursl, o.numberOfHoursl)==0)
        {
            return Double.compare(o.price, price);
        }
        return Integer.compare(numberOfHoursl, o.numberOfHoursl);
    }
}
