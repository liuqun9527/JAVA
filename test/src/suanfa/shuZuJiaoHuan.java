package suanfa;

public class shuZuJiaoHuan {
	/*
	 * 交换int数组中两个数的位置
	 */
	public static int[] awap(int[] arr,int a,int b) {
		arr[a] =arr[a]+arr[b];
		arr[b] = arr[a]-arr[b];
		arr[a] = arr[a]-arr[b];
		return arr;
	}
}
