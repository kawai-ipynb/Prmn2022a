package lecture2;

public class Exercise23 {
    public static void main(String[] args) {
        Tire[] tires = {
                new Tire(65),new Tire(65),new Tire(65),new Tire(65)
        };
        Engine engine = new Engine(4000);
        Car car = new Car(tires,engine);
        GasStation gasstation = new GasStation();
        gasstation.refuel(car);
        car.startEngine();
        car.run();
    }
}
