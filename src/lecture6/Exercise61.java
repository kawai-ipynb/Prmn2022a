package lecture6;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise61 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("小数値を入力:");
            Double d = inp.nextDouble();
            System.out.println("入力した値:" + d);
        }
        catch (InputMismatchException e) {
            System.out.println("エラー");
        }
    }
}
