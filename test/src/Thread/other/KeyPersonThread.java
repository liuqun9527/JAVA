package Thread.other;

public class KeyPersonThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"开始了战斗");
		
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"击杀了敌军 ");
		}
		
		System.out.println(Thread.currentThread().getName()+"结束战斗");
	}
}
