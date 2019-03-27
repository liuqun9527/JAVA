package test;
/**
 * 对象的初始化顺序：
 * （1）类加载之后，按从上到下（从父类到子类）执行被static修饰的语句；
 * （2）当static语句执行完之后,再执行main方法；
 * （3）如果有语句new了自身的对象，将从上到下执行构造代码块、构造器（两者可以说绑定在一起）。
 * @author feiben
 *
 */
public class HelloB extends HelloA{
	public HelloB() {
		System.out.println("This is HelloB");
	}
		{System.out.println("B class");}
		static {System.out.println("B static"); }
		
		public static void main(String[] args) {
			System.out.println("-------main start-------");
	        new HelloB();
	        new HelloB();
	        System.out.println("-------main end-------");
		}

	
}

class HelloA {
	public HelloA() {
		System.out.println("This is HelloA");
	}
	{System.out.println("A class");}
	static {System.out.println("A static"); }
}
