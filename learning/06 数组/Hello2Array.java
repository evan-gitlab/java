/*
 * javac -encoding utf-8 Hello2Array.java
 * java Hello2Array
 */

public class Hello2Array {
    public static void main(String[] args) {
        int[][] nums = new int[2][3];

        // 赋值
        nums[0][0] = 12;

        int[][] scores = {{98,76, 54}, {78, 65, 99}};
        
        // 定位行
        for (int i=0; i<scores.length; i++) {
            for (int j=0; j<scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        // 定义二维数组时也可以只指定行的个数，在为每一行分别指定列的个数
        String[][] names = new String[3][];
        names[0] = new String[2];
        names[1] = new String[3];
        names[2] = new String[4];

        names[0][0] = "Jim";
        names[1][1] = "Evan";
        names[2][3] = "Bob";

        System.out.println(names[0][0]);
        System.out.println(names[1][1]);
        System.out.println(names[2][3]);

    }
}