package Thread;

public class Actor extends Thread {
	
	public void run() {
		System.out.println(getName()+"  Actor的run方法开始");
		int count =0;
		while(count!=99) {
			System.out.println(getName()+"  Actor的run方法 :"+(++count));
			
			if(count%10==0) {
				try {
					//使线程进入停顿一段时间
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		System.out.println(getName()+"  Actor的run方法结束");
	}
	public static void main(String[] args) {
		Thread actor =new Actor();
		actor.setName("ACTOR");
		
		actor.start();
		
		Thread actresThread = new Thread(new Actres(),"runable");
		actresThread.start();
	}
}
class Actres implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"  Actres的run方法开始");
		int count =0;
		while(count!=99) {
			System.out.println(Thread.currentThread().getName()+"  Actres的run方法 :"+(++count));
			
			if(count%10==0) {
				try {
					//使线程进入停顿一段时间
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		System.out.println(Thread.currentThread().getName()+"  Actres的run方法结束");
		
	}
}


