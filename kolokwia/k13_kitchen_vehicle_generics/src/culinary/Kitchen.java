package culinary;

public class Kitchen implements Cloneable{
    private String name;
    private Stove stove;

    public Kitchen(String name, Stove stove) {
        this.name = name;
        this.stove = stove;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Kitchen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Kitchen clone() {
        try {
            Kitchen clone = (Kitchen) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "name='" + name + '\'' +
                ", stove=" + stove +
                '}';
    }
}
