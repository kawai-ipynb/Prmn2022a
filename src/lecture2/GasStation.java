package lecture2;

public class GasStation {
    void refuel(Car car) {
        car.fuel = car.fuel + 20;
        System.out.println("燃料を20追加しました。");
    }
}
