package healthcare;

public class TestHospital {
    public static void main(String[] args) {


        Hospital h1 = new Hospital("oki", 2.0);
        h1.setCapacity(-1);

        System.out.println(h1);

        Hospital h2 = new Hospital("Dworcowa", 30.0);

        System.out.println(h2);
        System.out.println(h1.equals(h2));

        Clinic c1 = new Clinic("ok", h1.getCapacity() ,3.1);
        System.out.println(c1);
        Clinic c2 = new Clinic("ok", h1.getCapacity() ,3.1);
        System.out.println(c1.equals(c2));
        System.out.println(h1.equals(c1));



    }
}
