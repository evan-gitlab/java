/*
 * javac -encoding utf-8 Ex4.java
 * java Ex4
 */

import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 e = new Ex4();
        int[] nums = e.getArray(8);

        System.out.println(Arrays.toString(nums));
    }

    public int[] getArray(int length) {
        int[] nums = new int[length];
        Random rand = new Random();
        for (int i=0; i<length; i++) {
            nums[i] = rand.nextInt(100);
        }

        return nums;
    }

}