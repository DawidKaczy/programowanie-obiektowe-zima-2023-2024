package games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ComputerGame {
    private String title;
    private String producer;
    private double[] ratings;

    public ComputerGame(String title, String producer, double[] ratings) {
        this.title = title;
        this.producer = producer;
        this.ratings = ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings.clone();
    }

    public void add(double element) {
        double[] newRatings = new double[ratings.length + 1];
        System.arraycopy(ratings, 0, newRatings, 0, ratings.length);
        newRatings[ratings.length] = element;
        ratings = newRatings;
    }
    public void remove(int index) {
        if (index >= 0 && index < ratings.length) {
            double[] newRatings = new double[ratings.length - 1];
            System.arraycopy(ratings, 0, newRatings, 0, index);
            System.arraycopy(ratings, index + 1, newRatings, index, ratings.length - index - 1);
            ratings = newRatings;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "  + title+", " +  producer+", "  + Arrays.toString(ratings)+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerGame that = (ComputerGame) o;
        return Objects.equals(title, that.title) && Objects.equals(producer, that.producer) && Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, producer);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
