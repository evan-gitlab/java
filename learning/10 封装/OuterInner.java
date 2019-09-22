public class OuterInner {

    private String name = "Evan";

    // 内部类
    public class Inner {
        private String name = "Bob";

        // 如果内部类和外部类具有相同的成员变量或方法
        // 内部类默认访问自己的成员变量或方法，如果要访问外部类的成员变量，可以使用this关键字
        public void show() {
            System.out.println(OuterInner.this.name + "'s github");
        }
    }
    public static void main(String[] args) {
        // 创建外部类对象
        // 外部类是不能直接使用内部类的成员和方法
        OuterInner oi = new OuterInner();
        // 创建内部类对象
        // 内部类 对象名 = 外部类对象.new 内部类();
        Inner i = oi.new Inner();

        i.show();
    }
}