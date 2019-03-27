package timu;

import java.util.Scanner;

public class zuiHou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.nextLine();
		System.out.println(str.lastIndexOf(" "));
		System.out.println(str.substring(str.lastIndexOf(" ")+1));
		int length =str.substring(str.lastIndexOf(" ")+1).length();
		System.out.println(length);
		
	}

}
