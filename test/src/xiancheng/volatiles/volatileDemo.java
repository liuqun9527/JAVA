package xiancheng.volatiles;

public class volatileDemo implements Runnable{
	private volatile  boolean isRunning = true;
	 int m;
	    public boolean isRunning() {
	        return isRunning;
	    }
	    public void setRunning(boolean isRunning) {
	        this.isRunning = isRunning;
	    }
	    @Override
	    public void run() {
	        System.out.println("进入run了");
	        while (isRunning == true) {
	            int a=2;
	            int b=3;
	            int c=a+b;
	            m=c;
	           // System.out.println(m);
	            try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	        System.out.println(m);
	        System.out.println("线程被停止了！");
	    }
	
}
