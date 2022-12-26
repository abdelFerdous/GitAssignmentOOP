public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Toy toy1 = new Toy();

        Toy toy2 = new Toy("carToy",5);
        Barbie barbie1 = new Barbie();
        Barbie barbie2=new Barbie("barbieGirl",45,"green");

        System.out.println(barbie1.toString());

        System.out.println(barbie2.toString());
        // turn the state of the toy to On
        barbie2.turnOn();
        System.out.println(barbie2.toString());
		System.out.println(toy1.getName() +" "+ toy1.getWeight());
		System.out.println(toy2.getName() +" "+ toy2.getWeight());
        System.out.println(toy1.toString());

    }

}
