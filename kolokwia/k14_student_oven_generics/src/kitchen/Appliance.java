package kitchen;

public interface Appliance {

    abstract void turnOn(String powerSource);
    abstract boolean isReady(int temperature);

    default void turnOff()
    {
        System.out.println("Urządzenie wyłączone");
    }
    default void emitSound()
    {
        System.out.println("Dźwięk");
    }
    static String info()
    {
        return "Info";
    }
}
