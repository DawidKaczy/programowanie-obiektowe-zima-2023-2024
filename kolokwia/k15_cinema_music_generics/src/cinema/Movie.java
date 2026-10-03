package cinema;

public class Movie implements Comparable<Movie>{
    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }


    @Override
    public int compareTo(Movie o) {
        if(Integer.compare(o.title.length(), title.length()) == 0)
        {
            return title.compareTo(o.title);
        }
        return Integer.compare(o.title.length(), title.length());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                '}' + "\n";
    }
}
