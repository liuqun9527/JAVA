package xiancheng.volatiles;

public class run {

	public static void main(String[] args) throws InterruptedException {
		 volatileDemo demo = new volatileDemo();
		 Thread tt = new Thread(demo);
	        tt.start();
	        Thread.sleep(1000);
	        demo.setRunning(false);

	        System.out.println("已经赋值为false");
	}

}
