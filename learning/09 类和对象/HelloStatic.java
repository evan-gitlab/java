
public class HelloStatic {
    // 该类对象共享一个成员
    // Java 中被 static 修改的成员称为静态成员或类成员，它属于类所有，类的所有对象共享

    static String name = "Evan";

    public static void main(String[] args) {
        System.out.println("通过类名访问name:" + HelloStatic.name);
        System.out.println(HelloStatic.class);

        // 创建类对象
        HelloStatic hs = new HelloStatic();
        System.out.println("通过对象访问name:" + hs.name);
        hs.name = "evan";
        System.out.println("通过类名访问name:" + HelloStatic.name);
    }
}