package zad4;

public class TextProcessor implements DataProcessor{


    @Override
    public String processData(String data) {
        StringBuilder s1 = new StringBuilder(data);
        s1.reverse();
        return s1.toString();
    }

    @Override
    public boolean isValid(String data) {
        return data != null && !data.isEmpty();
    }
}
