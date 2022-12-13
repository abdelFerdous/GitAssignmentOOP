public class Barbie extends Toy {

    private String color;
    private boolean isOn;

    public Barbie() {
        super("default_name",7);
        this.color="white";
        this.isOn=false;
    }

    public Barbie(String name , int weight , String color) {
        super(name , weight );
        this.color =color;
        this.isOn=false;
    }

    public void turnOn() {
        this.isOn=true;
    }

    public String toString() {
        return super.toString() + " color is "+this.color +" state is "+ this.isOn;
    }

}

