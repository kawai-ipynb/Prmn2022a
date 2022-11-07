package lecture2;

public class Exercise22 {
    public static void main(String[] args) {
        Car c = new Car();
        GasStation g = new GasStation();
        c.run();
        g.refuel(c);
        c.run();
    }
}
