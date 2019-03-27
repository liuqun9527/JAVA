package Thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 展示lock的方法
 */
public class LockExample5 {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		//加锁
		lock.lock();
		//释放锁
		lock.unlock();
		//是否可以获得这把锁
		lock.tryLock();
		//设定在规定时间等待获得锁，如果时间过了还没获得则会主动放弃
		//lock.tryLock(超时, 时间单位);
		
	}
}
