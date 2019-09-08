/**
 * 这是文档注释
 * @author evan
 * @version v1.0
 */

// javac -encoding utf-8 JavaDoc.java
// java JavaDoc
// javadoc -encoding utf-8 -d doc JavaDoc.java

public class JavaDoc {

	public static double sum(double a, double b) {
    	/**
 	 	 * 两数求和
 	     * @param 
         * @return 两数和
         *
 	     */
		return a + b;
	}

	public static void main(String []args) {
		System.out.print("两数之和为：" + sum(5, 12.4));
	}
}