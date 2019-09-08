/**
 * Java 产业的三种循环：while、do...while、for
 */

public class While {
	public static void main(String[] args) {
		int i = 1;
		while (i < 1000) {
			System.out.println("I love xi'an");
			i++;
		}

		// do ... while  先执行、后判断
		do {
			System.out.println("我爱西安");
			i++;
		} while (i <= 1000);


		// for
		/**
		 * for 关键字后面括号中的三个表达式必须用 ; 隔开，三个表达式都可以省略，但 ; 不能省略
		 */ 
		for (int idx = 1; idx < 100; idx++) {
			System.out.println("I love Xi'an");
		}

		for (int i1=1, i2=5; i1<=5; i1++,i2--) {
			System.out.println(i1 + " + " + i2 + " = " + (i1+i2));
		}

		for (int j = 1; j <= 10; j++) {
			if ((j > 2) && (j % 3 == 0)) {
				break;
			}
			System.out.println(j);
		}
		System.out.println("结束啦");


		// continue
		for (int j = 1; j <= 10; j++) {
			if (j % 2 != 0) {
				continue;
			}
			System.out.println(j);
		}


		// 多重循环
		for (int m = 1; m <= 3; m++) {
			for (int n = 1; n <= 8; n++) {
				System.out.print("*");
			}
			System.out.println();
		}


		for (int m = 1; m <= 3; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}