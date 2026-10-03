package zad13Interfejs;

class Email implements Powiadomienie{

    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Email:" + wiadomosc);
    }
}
