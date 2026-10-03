public interface Appliance {
    void turnOn(String powerSource);
    boolean isReady(int temperature);

    default void turnOff(){
        System.out.println("Urządzenie wyłączone");

    }
    default void emitSound(){
        System.out.println("Pik pik");
    }
    static String info()
    {
        return "Ogólne informacje";
    }
}
