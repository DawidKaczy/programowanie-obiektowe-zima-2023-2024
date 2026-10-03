import java.util.ArrayList;

public class Computer {

    String Ram;
    ArrayList<Integer> lists;
    ArrayList<Integer> lists22;



    Computer(){};
    Computer(String Ram, ArrayList<Integer> lists, ArrayList<Integer> lists22) {
        this.Ram = Ram;
        this.lists = lists;
        this.lists22 = lists22;
    }
    public String toString(){
        return this.Ram + this.lists + this.lists22;
    }

    public int copyListy()
    {
        int wynik = 0;
        ArrayList<Double>lista = new ArrayList<>();
        for(int i = 0; i < lists.size(); i++)
        {
            wynik += (lists.get(i));
        }
        for(int i = 0; i < lists22.size(); i++)
        {
            wynik += (lists22.get(i));
        }
        return wynik;
    }


}
