/**
 * 初始化父类再初始化子类
 * 先执行初始化对象中属性，再执行构造方法中的初始化 
 */
public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Dog类执行了");
    }
    /**
     * 方法重写
     * 如果子类对继承父类的方法不满意，是可以重写父类继承的方法，当调用方法时会优先调用子类的方法
     * 1、返回值类型
     * 2、方法名
     * 3、参数类型及个数
     * 
     */
    public void eat() {
        System.out.println("年龄：" + age + " 狗是可以吃东西的.");
    }

    public String toString() {
        return "Dog";
    }
}