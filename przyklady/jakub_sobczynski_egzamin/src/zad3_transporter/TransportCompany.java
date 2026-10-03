package zad3_transporter;

public class TransportCompany {
    public Transporter t1;

    public TransportCompany(Transporter t1) {
        this.t1 = t1;
    }

    public void transportTo(String target){
        t1.moveTo(target);
    }
}
