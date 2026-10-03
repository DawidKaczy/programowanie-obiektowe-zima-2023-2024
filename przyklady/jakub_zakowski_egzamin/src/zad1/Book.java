package zad1;

public record Book(String title, String author, int pages) {
    public  Book{
        if(pages<0){
            pages=70;
        }
    }
    public boolean isLong(){
        return pages >= 400;
    }
}
