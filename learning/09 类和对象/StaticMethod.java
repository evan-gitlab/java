
/**
 *  1、静态方法中可以直接调用同类中的静态成员，但不能直接调用非静态成员
 *  2、在普通成员方法中，则可以直接访问同类的非静态变量和静态变量
 *  3、静态方法中不能直接调用非静态方法，则需要通过对象访问非静态方法
 *  4、静态初始化块
 */
public class StaticMethod {
    String name;
    {
        name = "evan";
    }

    static double rate;

    public void show() {
        System.out.println("欢迎您,"+name);
    }

    // 静态初始化块只在类加载时执行，且只会执行一次
    static {
        rate = 0.75;
    }
    // 使用static关键字声明静态方法
    public static void print() {
        System.out.println("欢迎您, Evan");
    }
    public static void main(String[] args) {
        // 直接使用类名调用静态方法
        StaticMethod.print();

        // 通过类对象调用，推荐使用类名调用方式
        StaticMethod sm = new StaticMethod();
        sm.print();

        System.out.println("当前利率为：" + rate);
    }
}