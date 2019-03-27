package Thread.other;
/**
 * 军队线程
 * 模拟作战双方的行为
 * @author feiben
 *
 */
public class ArmyRunnable implements Runnable{
	//volatile可以保证线程可以正确读取其他线程写入的值
	//可见性问题
	volatile boolean keepRunning =true;
	@Override
	public void run() {
		while(keepRunning) {
			for(int i=0;i<5;i++) {
				System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
				//让出了处理器时间，下一次谁发起进攻还不一定
				Thread.yield();
			}
			
			
		}
		System.out.println(Thread.currentThread().getName()+"结束");
	}

}
