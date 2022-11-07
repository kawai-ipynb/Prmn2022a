package lecture2;

public class Exercise22 {
    public static void main(String[] args) {
        Car c = new Car(car,engine);
        GasStation g = new GasStation();
        c.run();
        g.refuel(c);
        c.run();
    }
}
