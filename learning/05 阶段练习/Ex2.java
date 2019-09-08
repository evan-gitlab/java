/*
 * javac -encoding utf-8 Ex2.java
 * java Ex2
 */

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		int classNum = 3;
		int stuNum = 4;

		double sumScore = 0;
		double avgScore = 0;
		for (int i = 1; i <= classNum; i++) {
			System.out.println("》》》请输入第"+ i + "个班级的成绩《《《");
			for (int j = 1; j <= stuNum; j++) {
				System.out.print("请输入第"+ j + "个学员的成绩：");
				Scanner sc = new Scanner(System.in);
				double score = sc.nextDouble();
				sumScore += score;
			}
			avgScore = sumScore / 4;
			System.out.println("第"+i+"个班级总成绩为：" + sumScore);
			System.out.println("第"+i+"个班级平均成绩为：" + avgScore);
			avgScore = 0;
			sumScore = 0;
		}
	}
}