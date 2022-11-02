package lecture1;

public class kannsuu {
    int Min(int[] score){
        int min = score[0];
        for (int i = 0;i < score.length;i++){
            if (min >= score[i]) {
                min = score[i];
            }
        }
        return min;
    }
    int Max(int[] score){
        int max = score[0];
        for (int i = 0;i < score.length;i++){
            if (max <= score[i]){
                max = score[i];
            }
        }
        return max;
    }
    double Ave(int[] score){
        double ave;
        int sum = 0;
        for (int i = 0;i < score.length;i++){
            sum = sum + score[i];
        }
        ave = (double)sum / (double)score.length;
        return ave;
    }
}
