/*
 * javac -encoding utf-8 ExArrays.java
 * java ExArrays
 */

 // Arrays 类是 Java 中提供的一个工具类，在 java.util 包中
 // 该类包含了一些方法用来直接操作数组，比如排序、搜索等

import java.util.Arrays;

public class ExArrays {
    public static void main(String[] args) {
        int[] scores = {78, 93, 97, 84, 63};

        // 1、排序 默认升序
        Arrays.sort(scores);
        System.out.println("排序后数组中元素的值：");
        
        for (int i=0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }

        // 2、将数组转换为字符串
        System.out.println("输出数组scores中的元素:" + Arrays.toString(scores));
    }
}


