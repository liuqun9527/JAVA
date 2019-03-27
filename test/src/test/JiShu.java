package test;

public class JiShu {
	public static boolean boo(int a) {
		return (a & 1)==1;
	}
	public static void main(String[] args) {
		System.out.println( boo(-2));
		System.out.println( !(-2%2==0));
	}
}
