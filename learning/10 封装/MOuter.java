public class MOuter {
    public void show() {
        final int a = 25;
        int b = 13;

        // 由于内部类不能在外部类的方法以外的地方使用，因此方法内部类不能使用控制符和 static 修饰符
        class MInner {
            int c = 2;
            public void print() {
                System.out.println("访问外部类方法中的常量a：" + a);
                System.out.println("访问内部类方法中的变量c：" + c);
            }
        }

        MInner mi = new MInner();
        mi.print();
    }

    public static void main(String[] args) {
        MOuter mo = new MOuter();
        mo.show();
    }
}