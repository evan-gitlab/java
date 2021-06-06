/*
 九九乘法表
 1 * 1 = 1
 1 * 2 = 2 2 * 2 = 4
 ...
 1 * 9 = 9 ... 9 * 9 = 81
 */
public class NineNineTab {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" * "+i+" = "+(i*j)+" ");
			}
			System.out.println();
		}
	}
}