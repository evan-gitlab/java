public class If {
	public static void main(String[] args) {
		int score = 92;
		if (score > 90) {
			System.out.println("奖励一个Mac");
		}

		int age = 25;
		if (age >= 18)
			System.out.println("成年");
		else
			System.out.println("未成年");


		score = 85;

		if (score > 90) {
			System.out.println("奖励一台Mac笔记本");
		}
		else if (score > 70) {
			System.out.println("奖励一台Thinkpad笔记本");
		}
		else
		{
			System.out.println("无奖励");
		}


		String today = "周末";
		String weather = "清朗";

		if (today.equals("周末")) {
			if (weather.equals("清朗")) {
				System.out.println("去游乐场");
			}
			else
			{
				System.out.println("去看电影");
			}
		}
		else
		{
			System.out.println("去上班");
		}
	}
}