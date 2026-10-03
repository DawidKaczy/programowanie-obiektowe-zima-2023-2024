public class TestSchool {
    public static void main(String[] args) {
        School d1 = new School("Klocek", "Mazurska", 2);
        School d2 = new School("", "opk", -3);
        School d3 = new School("", "", 3);
        System.out.println(d1.toString());
        System.out.println(d1.equals(d3));
        d1.recruitment(5);
        System.out.println(d1);
        School.checkLimit(d1);
        University u1 = new University(d1.name, d1.address, d1.students, "", 19);
        University u2 = new University(d1.name, d1.address, d1.students, "", 20);
        System.out.println(u1.toString());
        u1.recruitment(2);
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u1.equals(u2));
    }
}
