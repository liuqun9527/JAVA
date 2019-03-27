package test;
/**
 * 将一个字符串中的空格替换成 "%20"。
 * @author feiben
 *
 */
public class replace {

	public static void main(String[] args) {
		String s ="AB";
//		StringBuffer sb = new StringBuffer(s);
//		System.out.println(sb.charAt(1));
		System.out.println(replace(s));
	}
	
	public static String replace(String s) {
		StringBuffer sb = new StringBuffer(s);
		int i = 0;
		System.out.println(sb.indexOf(" "));
		while(sb.indexOf(" ")>=0) {
			i = sb.indexOf(" ",i);
			sb.replace(i, i+1, "%20");
		}
		return sb.toString();
		
	}
}
