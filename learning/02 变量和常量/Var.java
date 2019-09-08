/*
 * 变量名由多单词组成时，第一个单词的首字母小写，其后单词的首字符大写，俗称骆驼式命名法，如：myAge
 * 
 * 变量命名时，尽量简单且能清楚表达变量的作用，做到见名知意。如：stuName  保存 " 学生姓名" 信息
 * 
 * Java 变量名的长度没有限制，但区分大小写
 * 
 * 
 *  Java中变量使用规则
 *  1、Java 中变量需要先声明后使用
 *  2、变量定义时，可以声明的同时进行初始化
 *  3、变量中每次只能赋一个值，但可以修改多次
 *  4、main方法中定义的变量先赋值，然后才能输出
 *
 *
 *  javac -encoding utf-8 Var.java
 *  java Var
 */

public class Var {
    public static void main(String []args) {
        String love = "java";

        System.out.println("变量 love 的内容是：" + love);

        love = "I love java";
        System.out.println("重新赋值后变量 love 的内容是：" + love);


        String name = "Bob";
        char sex = 'M';
        int age = 18;
        double price = 120.5;

        System.out.println(name);
        System.out.println(sex);
        System.out.println(age);
        System.out.println(price);


        // int num;
        // System.out.println(num);  未初始化，语法错误


        /* 自动类型转换
         *
         * 条件：
         * 1、目标类型能与源类型兼容，如 double 兼容 int，但 char 不能兼容 int
         * 2、目标类型大于源类型，如 double 类型长度为 8 字节，int 类型长度为4字节 
         */
        int score = 82;
        double dScore = score;
        System.out.println(dScore);


        double avg = 78.5;
        System.out.println("考试平均分：" + avg);
        int rise = 5;

        avg += rise;
        System.out.println("调整好平均分：" + avg);


        /*
         * 强制类型转换
         */
        double num1 = 75.8;
        int num2 = (int)num1;
        System.out.println(num1);
        System.out.println(num2);


        /*
         * 常量
         * 值被设定后，在程序运行过程中不允许改变
         */

        final double PI = 3.14;


        /*
         * java 中三种类型注释： 单行注释、多行注释、文档注释
         */

        // 文档注释以 /** 开头，以 */ 结尾
        // 可以通过 javadoc 命令从文档中提取内容，生成程序 API 帮助文档
         
        // 多行注释以 /* 开头，以 */ 结尾

        // 单行注释以 // 开头，行尾结束

    }
}