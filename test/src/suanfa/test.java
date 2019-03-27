package suanfa;

public class test {
	/*
	 * 直接插入排序
	 * 从数组第二个元素开始，和第一个元素比较大小，按照规则排序，此时数组一二可以看成是已经排序好的数组，
	 * 然后再从剩下的元素一次插入到已经排好序的数组中
	 */
	public static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int j =i;
			while(j>0 && arr[j]<arr[j-1]) {
				awap(arr,j,j-1);
				j--;
			}
		}
	}
	/*
	 * 冒泡排序
	 * 	每次比较相连的两个数，如果不符合规则则交换位置，每一轮把最大或最小的数放到未排序的最好
	 */
	public static void popoSort(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			boolean flag = true;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					awap(arr,j,j+1);
					flag=false;
				}
			}
			//本次没有进行交换数据位置，说明数组已经有序了
			if(flag) {
				break;
			}
		}
		
	}
	/*
	 * 简单排序
	 * 	每次将最大或最小的值放到第一个
	 * 
	 */
	public static void easySort(int[] arr) {
		for(int i = 0;i<arr.length-1;i++){
			int min=i;
			for(int j=i;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min = j;
				}
			}
			if(min!=i) {
				awap(arr,min,i);
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,8,1,5,9,7,6};
		//easySort(arr);
		//popoSort(arr);
		sort(arr);
		for(int a:arr) {
			System.out.println(a);
		}
	}
	
	public static int[] awap(int[] arr,int i,int j) {
		arr[i] = arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i] = arr[i]-arr[j];
		return arr;
	}
}
