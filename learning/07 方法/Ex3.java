/*
 * javac -encoding utf-8 Ex3.java
 * java Ex3
 */

import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        Ex3 e = new Ex3();
        int[] scores = {79, 52, 98, 81};

        int count = e.sort(scores);

        System.out.println("共有"+count+"个成绩信息！");
    }

    /**
     * 功能：将考试成绩排序并输出，返回成绩个数
     * 定义一个包含整数数组参数的方法，传入成绩数组
     * 使用Arrays类对成绩数组进行排序输出
     * 方法执行后返回数组中元素的个数
     */
    public int sort( int[] scores) {
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        // 返回数组中元素的个数
        return scores.length;
    }
}