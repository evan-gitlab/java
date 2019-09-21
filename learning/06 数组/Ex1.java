/*
 * javac -encoding utf-8 Ex1.java
 * java Ex1
 */

 public class Ex1 {
    public static void main(String[] args) {
        int[] nums = new int[]{61, 23, 4, 74, 13, 148, 20};

        int maxNum = nums[0];
        int minNum = nums[0];
        double sumNum = nums[0];
        double avgNum = 0;

       
        for (int i = 1; i < nums.length; i++) {
            // 求最大值
            if (nums[i] > maxNum)
            {
                maxNum = nums[i];
            }

            // 求最小值
            if (nums[i] < minNum)
            {
                minNum = nums[i];
            }

            // 累加
            sumNum += nums[i];
        }

        // 求平均
        avgNum = sumNum / nums.length;

        System.out.println("数组中的最大值：" + maxNum);
        System.out.println("数组中的最小值：" + minNum);
        System.out.println("数组中的平均值：" + avgNum);
    }
 }