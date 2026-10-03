package zad4;

import java.util.Scanner;

public class NewExceptionTest {
    public static String getValidUserInput() throws InputTooShortException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("wpisz co najmniej 4 znaki z klawiatury: ");
        String input = scanner.next();
        if(input.length()>=4) {
            return "OK";
        }
        else {
            throw new InputTooShortException();
        }
    }


    public static void main(String[] args) {
        try {
            String input = getValidUserInput();
            System.out.println(input);
        } catch (InputTooShortException e) {
            System.out.println(e.getMessage());;
        }
    }
}
