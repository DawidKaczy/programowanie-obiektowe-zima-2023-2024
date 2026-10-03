package zad4;

public class InputTooShortException extends Exception{
    @Override
    public String getMessage() {
        return "Nieprawidłowy format danych";
    }
}
