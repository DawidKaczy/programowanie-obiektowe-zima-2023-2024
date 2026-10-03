package zad8Comparable;

public class Course implements Comparable<Course>{
    String name;
    int numberOfHours;
    Double price;

    public Course(String name, int numberOfHours, Double price) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfHours=" + numberOfHours +
                ", price=" + price +
                '}' + "\n";
    }

    @Override
    public int compareTo(Course o) {
        if(Integer.compare(numberOfHours, o.numberOfHours)== 0)
        {
            return Double.compare(price, o.price);
        }
        return Integer.compare(numberOfHours, o.numberOfHours);
    }
}
