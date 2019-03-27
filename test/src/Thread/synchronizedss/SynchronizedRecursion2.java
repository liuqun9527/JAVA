package Thread.synchronizedss;
/**
 * 可重入粒度测试：调用类另外的方法
 */
public class SynchronizedRecursion2 {
	public static void main(String[] args) {
		SynchronizedRecursion2 ss = new SynchronizedRecursion2();
		ss.method1();
	}
	private synchronized void method1() {
		System.out.println("这是method1");
		method2();
	}
	private synchronized void method2() {
		System.out.println("这是method2");
	}
}	
