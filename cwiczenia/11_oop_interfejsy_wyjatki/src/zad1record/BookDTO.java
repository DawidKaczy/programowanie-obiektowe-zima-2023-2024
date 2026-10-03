package zad1record;

public record BookDTO(String title, String author, Double price, int yearOfPublication ) {

    public BookDTO
    {
        if(price < 20.0)
        {
            price = 69.0;
        }
        else if (title.isEmpty())
        {
            title = "Puste";
        }
    }
    public boolean czyWiekszy(){
        return yearOfPublication >= 2000;
    }
}
