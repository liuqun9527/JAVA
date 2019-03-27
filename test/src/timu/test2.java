package timu;

public class test2 {
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	public static void main(String[] args) {
		System.out.println();
		System.out.println("..."+"for循环的参数：" +foo('A')+";"+foo('B')+"&& (i<2);"+foo('C'));
		int i=0;
		for(foo('A');foo('B') && (i<2);foo('C')) {
			i++;
			foo('D');
		}
	}
}
