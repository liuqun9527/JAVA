package Thread.synchronizedss;
/**
 * 可重入粒度测试：递归调用本方法
 *
 */
public class SynchronizedRecursion {
	int a=0;
	public static void main(String[] args) {
		SynchronizedRecursion ss = new SynchronizedRecursion();
		ss.method1();
	}
	private synchronized void method1() {
		System.out.println("这是method1:a = "+a);
		if(a==0) {
			a++;
			method1();
		}
	}
}	
