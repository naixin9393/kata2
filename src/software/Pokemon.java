package software;

public class Pokemon {
    private final String name;
    private final String type1;
    private final String type2;
    private final double height;
    private final double weight;

    public String name() {
        return name;
    }

    public String type1() {
        return type1;
    }

    public String type2() {
        return type2;
    }

    public double height() {
        return height;
    }

    public double weight() {
        return weight;
    }

    public Pokemon(String name, String type1, String type2, double height, double weight) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s: %s-%s %sm %skg", name, type1, type2, height, weight);
    }
}
