package lecture5;
import java.util.ArrayList;
public class Exercise57 {
    public static void main(String[] args) {
        ArrayList<Insect> list = new ArrayList<>();
        list.add(new Insect());
        list.add(new Butterfly());
        list.add(new Locust());
        list.add(new SwallowtailButterfly());

        list.get(0).move();
        list.get(1).move();
        list.get(2).move();
        list.get(3).move();

    }
}
