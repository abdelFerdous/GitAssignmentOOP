public class Toy {
    private String name;
    private int weight;

    public Toy() {
        this.name="default_name";
        this.weight=2; // default weight
    }


    public Toy(String name , int weight) {
        this.name=name;
        this.weight=weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name+" "+this.weight;
    }

}
