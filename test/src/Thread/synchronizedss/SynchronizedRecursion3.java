package Thread.synchronizedss;
/**
 * 可重入粒度测试：调用父类的方法
 */
public class SynchronizedRecursion3 extends TestClass{
	public synchronized void doSomethion() {
		System.out.println("我是子类方法");
		super.doSomethion();
	}
	public static void main(String[] args) {
		SynchronizedRecursion3 tt=new SynchronizedRecursion3();
		tt.doSomethion();
	}
}	
class TestClass  {
	public synchronized void doSomethion() {
		System.out.println("我是父类方法");
	}
	
	
}
