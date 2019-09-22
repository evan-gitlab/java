public class SOuter {
    private int a = 99;
    static int b = 1;

    // 1、静态内部类不能直接访问外部类的非静态成员，可以通过 new 外部类().成员 的方式访问
    // 2、创建静态内部类对象时，不需要外部类的对象，可直接创建
    public static class SInner {
        int b = 2;
        public void show() {
            System.out.println("访问外部类中的b：" + SOuter.b);
            System.out.println("访问内部类中的b：" + b);
        }
    }

    public static void main(String[] args) {
        SInner si = new SInner();
        si.show();
    }
}