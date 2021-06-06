/*
 100以内所有质数
 质数：素数，只能被1和他本身整除的自然数
 */
public class PrimeNumber {
	public static void main(String[] args) {
		boolean isFlag = true;
		// 当前时间毫秒数
		long start = System.currentTimeMillis();
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i%j == 0) {
					isFlag = false;
					break;
				}
			}
			if (isFlag) {
				System.out.println(i);
			} else {
				isFlag = true;
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("所花费时间："+(end - start));
	}
}