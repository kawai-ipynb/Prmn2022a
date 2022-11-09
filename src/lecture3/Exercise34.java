package lecture3;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise34 {
    public static void main(String[] args) {
        ArrayList<Vegetable> ar = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 3;i++){
            System.out.println("野菜の名前を入力:");
            String n = input.nextLine();
            System.out.println("値段を入力:");
            int v = input.nextInt();
            String z = input.nextLine();
            ar.add(new Vegetable(n,v));
        }
        for(int i = 0;i < 3;i++){
            ar.get(i).print();
        }
    }
}
