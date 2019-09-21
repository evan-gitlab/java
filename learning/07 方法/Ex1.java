/*
 * javac -encoding utf-8 Ex1.java
 * java Ex1
 */

 public class Ex1 {
     public static void main(String[] args) {
        Ex1 e = new Ex1();
        int max = e.getMaxAge();
        System.out.println("最大年龄为：" + max);
     }

     public int getMaxAge() {
         int[] ages = {18, 23, 21, 19, 25, 29, 17};

         int max = ages[0];

         for (int age : ages) {
             if (max < age) {
                 max = age;
             }
         }

         return max;
     }
 }