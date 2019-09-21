/*
 * javac -encoding utf-8 OverLoading.java
 * java OverLoading
 */

public class OverLoading {
    public static void main(String[] args) {
        OverLoading ol = new OverLoading();
        ol.show();
        ol.show("Evan");
        ol.show("Evan", 18);
        ol.show(18, "Evan");
    }

    /**
     * 重载的依据：
     * 1、必须同一个类中
     * 2、方法名相同
     * 3、方法参数的个数、顺序或类型不同
     * 4、与方法的修饰符或返回值没有关系 
     */
    public void show() {
        System.out.println("Welcome");
    }

    public void show(String name) {
        System.out.println("Welcome " + name);
    }

    public void show(String name, int age) {
        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);
    }

    public void show(int age, String name) {
        System.out.println("Welcome " + name);
        System.out.println("Your age is " + age);
    }
}