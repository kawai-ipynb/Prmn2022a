package lecture1;

public class Main {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        String a;
        for(int i = 0;i < score.length;i++){
            if (score[i] >= 100){
                a = "秀";
            }else if (score[i] >= 80){
                a = "優";
            }else if (score[i] >= 70){
                a = "良";
            }else if (score[i] >= 60){
                a = "可";
            }else{
                a = "不可";
            }
            System.out.println(i + "番 " + score[i] + "点　" + a);
        }

        kannsuu kannsuu = new kannsuu();

        int min = kannsuu.Min(score);
        System.out.println("最低点:" + min + "点");

        int max = kannsuu.Max(score);
        System.out.println("最高点:" + max + "点");

        double ave = kannsuu.Ave(score);
        System.out.println("平均点:" + ave + "点");

    }

    }

