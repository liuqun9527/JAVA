package test;

public class Easy {

	public static void main(String args[]) {
		// 创建一个StringBuffer对象
		StringBuffer sb = new StringBuffer();// 创建了一个空的字符序列缓冲区，初始容量为16个字符
		/*
		 * sb.append("hello"); sb.append(1); sb.append(false); sb.append(2.4); char[]
		 * charArr = {'a' ,'b' , 'c'}; sb.append(charArr); sb.append(charArr,1,2);
		 */
		/*
		 * 像StringBuffer这样的方法，因为这些方法的返回值依然是本类的对象， 所以可以在方法执行结束之后，依然采用.的形式去调用该类的其他方法。
		 * 那么这种编程形式，就称为链式编程
		 */
		sb.append("hello").append(true).append(2.4).append(1);
		String str = sb.toString();// 将StringBuffer对象转换为String对象
		System.out.println(str);
		sb.insert(5, "world").insert(10, "java");
		System.out.println(sb.toString());
		sb.delete(5, 9);
		System.out.println(sb.toString());
		sb.deleteCharAt(5);
		System.out.println(sb.toString());
		sb.replace(0, 5, "world");
		System.out.println(sb.toString());
		System.out.println("----------------------------");
		/*
		 * 有这样一个字符串：abcdefgh，将该字符串逆序输出
		 */
		String str1 = "abcdefgh";
		char[] strChar = str1.toCharArray(); // char里的方法
		char[] newStrChar = new char[strChar.length];
		for (int i = strChar.length - 1, j = 0; i > -1 && j < newStrChar.length; i--, j++) {
			newStrChar[j] = strChar[i];
		}
		String newStr = new String(newStrChar);
		System.out.println(newStr);
		System.out.println("----------------------------");
		StringBuffer sb2 = new StringBuffer("abcdefgh");
		System.out.println(sb2.reverse());

	}

}
