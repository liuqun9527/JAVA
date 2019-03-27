package Thread.other;
/**
 * 大戏舞台
 * @author feiben
 *
 */
public class Stage extends Thread{
	
	public void run() {
		System.out.println("好像开始");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ArmyRunnable dynasty = new ArmyRunnable();
		ArmyRunnable revolt = new ArmyRunnable();
		
		Thread armyOfDynasty = new Thread(dynasty,"dynasty");
		Thread armyOfRevolt = new Thread(revolt,"revolt");
		
		armyOfDynasty.start();
		armyOfRevolt.start();
		
		//舞台线程休眠
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dynasty.keepRunning=false;
		revolt.keepRunning=false;
		
		try {
			armyOfRevolt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("程咬金");
		Thread mrCheng = new KeyPersonThread();
		mrCheng.setName("程咬金");
		System.out.println("安居乐业");
		//军队停止作战
		dynasty.keepRunning=false;
		revolt.keepRunning=false;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * 历史大戏留关键任务
		 */
		mrCheng.start();
		try {
			mrCheng.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("战争结束");
	}
	
	public static void main(String[] args) {
		
		new Stage().start();
	}

}
