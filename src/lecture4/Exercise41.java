package lecture4;

public class Exercise41 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(100,45,"inoue");
        Fighter f2 = new Fighter(150,30,"kawakami");

        while(true) {
            f1.attack(f2);
            if (!f2.isAlive()) {
                System.out.println(f2.getName() + "は倒れた");
                System.exit(0);
            }
            f2.attack(f1);
            if(!f1.isAlive()){
                System.out.println(f1.getName() + "は倒れた");
                System.exit(0);
            }

        }
    }
}
