package test;


public class JoinExample {

private class A extends Thread {

	@Override
	public void run() {
		System.out.print("A");
	}
		
}

private class C extends Thread {

	@Override
	public void run() {
		System.out.print("C");
	}
		
}


private class B extends Thread {

    private A a;

    B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            a.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("B");
    }
}

	public void test() {
		A a = new A();
		B b = new B(a);
		C c = new C();
		b.start();
		c.start();
		a.start();
		
	}
	public static void main(String[] args) {
		JoinExample jj = new JoinExample();
		for(int i=0;i<100;i++) {
			jj.test();
			System.out.println("");
		}
		
	}
}

