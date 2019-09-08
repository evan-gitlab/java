/*
 * javac -encoding utf-8 Ex1.java
 * java Ex1
 */

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		int score = 53;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入考试成绩：");
		score = sc.nextInt();
		int count = 0;

		System.out.println("加分前成绩：" + score);

		while (score < 60) {
			score ++;
			count++;
		}

		System.out.println("加分后成绩：" + score);
		System.out.println("共加分" + count + "次!");
	}
}