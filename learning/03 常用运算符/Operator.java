/**
 *
 * Java常用运算符：
 *   Ø 算术运算符
 *   Ø 赋值运算符
 *   Ø 比较运算符
 *   Ø 逻辑运算符
 *   Ø 条件运算符
 */

public class Operator {
	public static void main(String[] args) {

        // 1、算术运算符
		int x1 = 16;
		int x2 = 20;

		int sum = x1 + x2;

		System.out.println("两数之和为:" + sum); 


		int x = 5;
		int y = ++x;
		System.out.println("x:" + x);  // 6
		System.out.println("y:" + y);  // 6

		int m = 5;
		int n = m++;
		System.out.println("m:" + m);  // 6
		System.out.println("n:" + n);  // 5


		// 2、赋值运算符
		int one = 1;
		int two = 2;
		int three;

		three = one + two;
		System.out.println("three = one + two ==> " + three);
		three += one;
		System.out.println("three += one ==> " + three);
		three *= one;
		System.out.println("three *= one ==> " + three);
		three /= one;
		System.out.println("three /= one ==> " + three);
		three %= one;
		System.out.println("three %= one ==> " + three);

		// 3、逻辑运算发
		boolean a = true;
		boolean b = false;
		boolean c = false;
		boolean d = true;

		System.out.println((a&&b) + " 未通过");
		System.out.println((a||d) + " 通过");
		System.out.println((!a) + " 未通过");
		System.out.println((!b) + " 通过");


		// 4、条件运算符
		String msg = (8>5) ? "8 大于 5" : "8 不大于 5";
		System.out.println(msg);


		// 运算符优先级
		// 大家没必要死机运算符的优先级顺序，实际开发中，一般会使用小括号辅助进行优先级管理

		x = 12;
		y = x * ((x + 18) % 4);
		System.out.println("y : " + y);   // 24

		System.out.println((11+3*8) / 4 % 3);   // 2
	}
}