package suanfa;

public class sort {
	/**
	 * 直接插入排序
	 * 	每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止
	 * 时间复杂度O(n^2)
	 * @param arr
	 * @return
	 */
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j =i;
			while(j>0 && arr[j]<arr[j-1]) {
				shuZuJiaoHuan.awap(arr, j, j-1);
				j--;
			}
			
		}
		return arr;
	}
	
	
	/**
	 * 冒泡排序
	 * 每次都是比较相连两个元素的大小，按照规则是否进行交换元素，每一轮将最大或最小的元素排在数组最末端。
	 * 时间复杂度O(n^2)
	 * @author feiben
	 *
	 */
	public static int[] bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			boolean flag = true;//设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已然完成
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					shuZuJiaoHuan.awap(arr, j, j+1);
					flag=false;
				}
			}
			if(flag) {
				break;
			}
		}
		
		return arr;
	}
	
	/**
	 * 简单排序
	 * 每一趟从待排序的数据元素中选择最小（或最大）的一个元素作为首元素，直到所有元素排完为止，简单选择排序是不稳定排序
	 * 时间复杂度为O(n^2)
	 * @author feiben
	 *
	 */
	public static int[] selectSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			//每一次循环比较时，min用于存放较小元素的数组下标，这样当前批次比较完毕最终存放的就是本次内最小的元素的下标，避免每次遇到较小元素都要进行交换
			int min =i;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			//如果min变化，就进行交换
			if(min!=i) {
				shuZuJiaoHuan.awap(arr, min, i);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,45,3,6,0,2};
		//bubbleSort(arr);
		insertionSort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
}
