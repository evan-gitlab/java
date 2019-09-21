/*
 * javac -encoding utf-8 Ex1.java
 * java Ex1
 */

/**
 * 万物皆对象，客观存在的事务皆为对象
 * 类是抽象的概念，仅仅是模板
 * 步骤：
 * 1、定义类名
 * 2、编写类的属性
 * 3、编写类的方法
 * 
 */

public class Telephone {
    
    // 属性
    double screen; // 屏幕尺寸
    double cpu;    // CPU
    double mem;    // 内存大小

    // 当没有指定构造方法时，系统会自动添加无参构造方法
    public Telephone() {
        System.out.println("无参构造方法执行了");
    }

    public Telephone(double screen, double cpu, double mem) {
       this.cpu = cpu;
       if (screen < 3.5)
       {
           screen = 3.5;
           System.out.print("您赋值的参数有问题，自动赋值 3.5");
       }
       else
       {
           this.screen = screen;
       }
       this.mem = mem;
    }

    // 方法
    void call() {
        System.out.println("CPU:" + cpu + "HZ");
        System.out.println("打电话");
    }

    void sendMessage() {
        System.out.println("发短信");
    }

    void show() {
        System.out.println("CPU:" + cpu + "HZ");
        System.out.println("屏幕尺寸:" +screen);
        System.out.println("内存大小" + mem + "G");
    }

}