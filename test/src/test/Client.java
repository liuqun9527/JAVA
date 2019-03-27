package test;

public class Client {
	public static int count = 0;
	{
		count++;
	}

	public Client() {

	}

	public Client(int i) {
		this();
	}

	public Client(String string) {
	}

	public static void main(String[] args) {
		new Client();
		System.out.println(Client.count);
		new Client(1);
		System.out.println(Client.count);
		new Client("1");
		System.out.println(Client.count);
	}
}
