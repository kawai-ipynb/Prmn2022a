package lecture3;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println("何行分入力しますか？");
        int b = input.nextInt();
        String x = input.nextLine();
        for(int i = 1;i <= b;i++){
            System.out.println(i + "行目:");
            a.add(input.nextLine());
        }
        System.out.println("入力した文字列:");
        for(int i = 0;i < b;i++){
            System.out.println("[" + i + "] " + a.get(i));
        }
    }
}
