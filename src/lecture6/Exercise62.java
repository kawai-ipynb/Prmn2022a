package lecture6;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise62 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(6) + 1);
        }

        System.out.println("さいころを5つふりました");

        try {
            System.out.print("何番目のさいころの値を確認しますか？:");
            int index = inp.nextInt();
            System.out.println(index + "番目のさいころの値:" + list.get(index));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("list範囲外のアクセスを確認しました");
            System.out.println("終了します");
        }
        catch (InputMismatchException e) {
            System.out.println("整数値以外の入力を確認しました");
            System.out.println("終了します");
        }


    }
}
