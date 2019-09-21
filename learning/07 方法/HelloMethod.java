/*
 * javac -encoding utf-8 HelloMethod.java
 * java HelloMethod
 */

public class HelloMethod {

    /*
     * 访问修饰符 返回值类型 方法名(参数列表) { 方法体 }
     * 访问修饰符 public、protected、private、省略
     * 无参无返回值函数、无参带返回值函数、带参无返回值函数、带参带返回值函数
     * */
    public void print() {
        System.out.println("Hello Method");
    }

    public void show() {
        System.out.println("Welcome to Xi'an");
    }

    public int calcSum() {
        int a = 5;
        int b = 12;

        int sum = a + b;

        return sum;
    }

    public static void main(String[] args) {
        HelloMethod hm = new HelloMethod();
        hm.print();

        hm.show();
        int sum = hm.calcSum();
        System.out.println("两数之和为：" + sum);
    }
}