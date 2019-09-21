/*
 * javac -encoding utf-8 HelloForEach.java
 * java HelloForEach
 */

public class HelloForEach {
    public static void main(String[] args) {
        // foreach 是for语句的特殊简化版本
        // for (元素类型 元素变量 : 遍历对象) { 执行代码; }
        String[] names = {"Jim", "Evan", "Bob"};
        System.out.println("***使用for循环输出数组中的元素***");
        for (int i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("***使用foreach循环输出数组中的元素***");
        for (String name : names) {
            System.out.println(name);
        }
    }
}