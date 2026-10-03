package zad4_custom_exception;

public class ValueTooLowException extends Exception{
    public ValueTooLowException(){
        super();
    }
    public ValueTooLowException(String errorMessage){
        System.out.println(errorMessage);
    }
}
