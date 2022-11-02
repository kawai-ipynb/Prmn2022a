package lecture1;

public class kadai14 {
    public static void main(String[] args) {
        int[] ia = new int[100];
        int sum = 0;
        for (int i = 0;i < ia.length;i++){
            ia[i] = i + 1;
            if (i % 2 == 0) {
                sum = sum + ia[i];
            }
        }
        System.out.println("sum = " + sum);
    }
}
