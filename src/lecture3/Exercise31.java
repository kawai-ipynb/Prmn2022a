package lecture3;
import java.util.Scanner;
public class Exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("任意の文字列を入力してください:");
        String s = input.nextLine();
        System.out.println("”" + s + "”" + "と入力されました");
    }
}
