package lecture3;
import java.util.Scanner;
public class Exercise33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("一つ目の整数を入力:");
        int n1 = Integer.parseInt(input.nextLine());
        System.out.println("二つ目の整数を入力:");
        int n2 = Integer.parseInt(input.nextLine());
        int n3 = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + n3);
    }

}
