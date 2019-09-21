import java.util.Arrays;

/*
 * javac -encoding utf-8 Ex1.java
 * java Ex1
 */

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] scores = {89, -23, 64, 91, 119, 52, 73};
        Ex1 e = new Ex1();

        int[] top3Score = e.getTop3(scores);
        System.out.println(Arrays.toString(top3Score));
    }

    public int[] getTop3(int[] scores) {
        Arrays.sort(scores);

        int[] top3Scores = new int[3];
        for (int i=scores.length-1, j=1; i>0; i--) {
            if (scores[i] >= 0 && scores[i] <= 100) {
                System.out.println(j);
                if (j > 3)
                {
                    System.out.println("共循环" + j + "次");
                    break;
                }
                top3Scores[3-j] = scores[i]; 
                j++;
            }
        }
        return top3Scores;
    }
}