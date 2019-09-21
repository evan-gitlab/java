/*
 * javac -encoding utf-8 Ex2.java
 * java Ex2
 */

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 e = new Ex2();
        int[] scores = {84, 91, 99, 100};
        e.print(scores);
    }

    public void print(int[] scores) {
        System.out.println(Arrays.toString(scores));
    }
}
