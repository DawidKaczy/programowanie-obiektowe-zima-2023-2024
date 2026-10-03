package zad3_transporter;

public class TestTransporter {
    public static void main(String[] args) {
        TransportCompany t1 = new TransportCompany(new Car());
        TransportCompany t2 = new TransportCompany(new Helicopter());
        t1.transportTo("Elo");
        t2.transportTo("Helikopter");



    }
}
