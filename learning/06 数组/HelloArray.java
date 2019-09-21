/*
 * javac -encoding utf-8 HelloArray.java
 * java HelloArray
 */

public class HelloArray {
    public static void main(String[] args) {
        // 定义一个数组，保存五名学生的成绩
        // 等价于 int[] scores = new int[]{78, 93, 97, 84, 63};
        int[] scores = {78, 93, 97, 84, 63}; 

        // 输出数组中的第二个成绩
        System.out.println("数组中的第二个成绩为：" + scores[1]);

        // 定义存储学生身高的数组，类型为浮点数
        double height[];

        height = new double[5];

        // 定义存储学生姓名的数组，类型为字符串
        String[] names;
        names = new String[5];

        // 声明数组的同时为它分配空间
        // int scores = new int [5];

        height[0] = 176;
        height[1] = 169;

        System.out.println("height数组中第一个元素的值：" + height[0] + "cm");

        String[] subjects = new String[5];
        // 分别为数组中的元素赋值
        subjects[0] = "Oracle";
        subjects[1] = "C++";
        subjects[2] = "Linux";
        subjects[3] = "Python";
        subjects[4] = "Java";

        System.out.println("数组中第4个科目为：" + subjects[3]);

        // 使用循环操作数组
        for (int i=0; i<scores.length; i++) {
            System.out.println("数组中第"+(i+1)+"个元素的值是"+scores[i]);
        }

        // java.lang.ArrayIndexOutOfBoundsException
        // scores[5] = 100;
    }
}