package geography;

import java.util.Arrays;

public class Mountain implements Cloneable {
    private String name;
    private double[] heights;

    public Mountain(String name, double[] heights) {
        this.name = name;
        this.heights = heights;
    }

    public String getName() {
        return name;
    }

    public double[] getHeights() {
        return heights;
    }

    public void zamiana(double element)
    {
        heights[0] = element;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                ", heights=" + Arrays.toString(heights) +
                '}';
    }

    @Override
    public Mountain clone() {
        try {
            Mountain clone = (Mountain) super.clone();
            clone.heights = this.heights.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
