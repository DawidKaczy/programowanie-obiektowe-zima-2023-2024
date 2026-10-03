package zad3_transporter;

public class Car implements Transporter{
    @Override
    public void moveTo(String target) {
        System.out.println("Move to: "+target+" by car");
    }
}
