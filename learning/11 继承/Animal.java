
/**
 * final 修饰类， 类不能被继承
 * final 修饰方法，则该方法不允许被覆盖
 * final 修饰属性，则该类属性不会被隐式的初始化 (定义或构造函数中必须初始化) 
 * final 修改变量，则不允许修改，常量
 */

public class Animal {
    public String name;
    public int age = 10;

    public Animal() {
        System.out.println("Animal类执行了");
        age = 20;
    }

    public void eat() {
        System.out.println("动物具有吃东西的能力");
    }
}