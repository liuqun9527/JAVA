package test;

public abstract class MyClass {
	public int cons = 5;
	//普通方法一定要实现，变量可以初始化或不初始化但不能初始化后在抽象类中重新赋值或操作该变量（只能在子类中改变该变量）
	//非静态属性，此时还没有在内存中划分空间，例如，想着自己有三块钱，但是你却实际中用这三块钱去买东西了
	//放在静态代码块中即可
	//static {int cons = 5;cons = cons+5;}
	
	public void method() {};
}
