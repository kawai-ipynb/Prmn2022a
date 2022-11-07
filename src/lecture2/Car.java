package lecture2;

public class Car {
    int fuel;


    Tire[] tires = new Tire[4];

    Engine engine;

    Car(Tire[] tires, Engine engine){
        this.fuel = 0;
        this.engine = engine;
        for (int i = 0;i < tires.length;i++){
            this.tires[i] = tires[i];
        }
    }

    void run(){
        if(fuel <= 0){
            System.out.println("燃料が無く、走れませんでした。");
        }
        else {
            fuel = fuel - 1;
            System.out.println("燃料を1消費して走りました。");
        }
    }

    void startEngine(){
        engine.start();
    }
}
