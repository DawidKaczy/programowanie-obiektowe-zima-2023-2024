import java.util.ArrayList;
import java.util.Objects;

public class Computer {
    String nazwa1;
    String nazwa2;
    ArrayList<Double> ArrayLista;

    Computer(){};
    Computer(String nazwa1, String nazwa2, ArrayList<Double> ArrayLista) {
        this.nazwa1 = nazwa1;
        this.nazwa2 = nazwa2;
        this.ArrayLista = ArrayLista;
    }

    public String toString(){
        return this.nazwa1 + this.nazwa2 + this.ArrayLista;
    }

    public boolean equals(Object obj){
        if(obj instanceof Computer)
        {
            Computer computer =(Computer)obj;
            return(Objects.equals(nazwa1, computer.nazwa1) && Objects.equals(nazwa2, computer.nazwa2) && ArrayLista == computer.ArrayLista);
        }
        return false;
    }

    public double sumLists()
    {
        double wynik = 0;
        for(int i = 0; i < ArrayLista.size(); i++)
        {
            wynik = ArrayLista.get(i) + wynik;
        }
        return wynik;
    }
}

class Laptop extends Computer {

    double displaySize;
    Laptop(){}

    public Laptop(String nazwa1, String nazwa2, ArrayList<Double> ArrayLista, double displaySize) {
        super(nazwa1, nazwa2, ArrayLista);
        this.displaySize = displaySize;
    }

    public String toString(){
        return(super.nazwa1 + super.nazwa2 + super.ArrayLista + this.displaySize);
    }

    public boolean equals(Object obj){
        if(obj instanceof Laptop)
        {
            Laptop laptop =(Laptop)obj;
            return(Objects.equals(super.nazwa1, laptop.nazwa1) && Objects.equals(super.nazwa2, laptop.nazwa2) && super.ArrayLista == laptop.ArrayLista && this.displaySize == laptop.displaySize);
        }
        return false;
    }
    public double sumLists()
    {
        double wynik = 0;
        return wynik = super.sumLists() + 1000;
    }
}
