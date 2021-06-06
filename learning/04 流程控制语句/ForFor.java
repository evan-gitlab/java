/**
 * 嵌套循环的使用
 * 1. 嵌套循环 将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
 *
 * 2. 
 *    外层循环：循环结构B
 *    内层循环：循环结构A
 *
 * 3. 说明
 *    ①内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
 *    ②假设外层循环需要执行m次，内层循环需要执行n次，此时内层循环的循环体一共执行了 m*n 次
 *
 * 4. 技巧
 *    外层循环控制行数，内层循环控制列数
 */
public class ForFor {
	public static void main(String[] args) {
		//1. 输出******
		// A方案
		System.out.println("******");
		// B方案
		for (int i = 0; i < 6; i++) {
			System.out.print('*');
		}
		System.out.println();
		
		/*
		 * 2. 输出四行6个*，******
		 *
		 *
		 */
		 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();
		
		/*
		 * 3. *
		 *    **
		 *    ***
		 *    ****
		 *    *****
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 * 4. *****
		 *    ****
		 *    ***
		 *    **
		 *    *
		 */
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 *     *
		 *    * *
		 *   * * *
		 *  * * * *
		 * * * * * *
		 *  * * * *
		 *   * * *
		 *    * *
		 *     *
		 */
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}