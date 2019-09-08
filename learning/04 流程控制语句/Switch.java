/**
 * 1、swith 后面小括号中的值必须是整形或字符型
 * 2、case 后面的值可以使常量数值
 * 3、case 匹配后，执行匹配块李的程序代码，如果没有遇见break，会继续执行下一个 case 块的内容，直到遇到 break 或者 switch 语句块结束。
 * 4、可以把相同的 case 语句合并起来
 * 5、default 块可以出现在任意位置，也可以省略
 */
public class Switch {
	public static void main(String[] args) {
		int num = 3;

		switch (num) {
			case 1:
				System.out.println("奖励笔记本一台");
				break;
			case 2:
				System.out.println("奖励手机一部");
				break;
			default:
				System.out.println("无奖励");
			case 3:
				System.out.println("奖励Kindle一部");
				break;
		}
			
	}
}