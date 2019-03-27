package Thread.synchronizedss;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedToLock4 {
	Lock lock =new ReentrantLock();
	public synchronized void method1() {
		System.out.println("我是synchronized形式的锁");
	}
	public void method2() {
		lock.lock();
		
		try {
			System.out.println("lock形式的锁");
		} finally {
			lock.unlock();
		}
	}
	public static void main(String[] args) {
		SynchronizedToLock4 s = new SynchronizedToLock4();
		s.method1();
		s.method2();
	}
}
