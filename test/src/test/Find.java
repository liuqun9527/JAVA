package test;
/**
 * 在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。请找出数组中任意一个重复的数字
 * @author feiben
 *解题思路
 *
 *	要求是时间复杂度 O(N)，空间复杂度 O(1)。因此不能使用排序的方法，也不能使用额外的标记数组。

对于这种数组元素在 [0, n-1] 范围内的问题，可以将值为 i 的元素调整到第 i 个位置上进行求解。

以 (2, 3, 1, 0, 2, 5) 为例，遍历到位置 4 时，该位置上的数为 2，但是第 2 个位置上已经有一个 2 的值了，因此可以知道 2 重复：
	详解：当首先寻找数组第一个元素[0]，为2 ，此时2！=0 ，然后查看数组下标为2的元素 [2]=1!=2,所以将[0]和[2]上数字交换位置
	数组变为[1,3,2,0,2,5]
	此时在while循环里
		然后此时[0]为1，查找[1]=3 ！=[0],所以交换[0]和[1]的位置
	数组变为[3,1,2,0,2,5]
		在while循环里  [0]= 3 ,[3] =0!= [0],交换[0]和[3]的位置
	数组变为[0,1,2,3,2,5] 在while循环里，判断条件 [0]=0，跳出while循环进入for循环 i=1
								判断条件[1] = 1 不进入while循环 for   i=2
								判断条件[2] = 2 不进入while循环 for   i=3
								判断条件[3] = 3 不进入while循环 for   i=4
					判断条件[4]= 2 !=4，进入while循环  判断 if(2 == [2]) 相等，跳出整个循环,返回true
 */
public class Find {
	public boolean duplicate(int[] nums) {
	    if (nums == null )
	        return false;
	    //遍历数组
	    for (int i = 0; i < nums.length; i++) {
	    	System.out.println("nums["+i+"]="+nums[i]);
	    	//当数组下标为 i的值不等于i时 即 
	        while (nums[i] != i) {
	        	System.out.println("nums["+i+"]="+nums[i]);
	            if (nums[i] == nums[nums[i]]) {
	                return true;
	            }
	            swap(nums, i, nums[i]);
	        }
	    }
	    return false;
	}

	private void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}
	public static void main(String[] args) {
		int[] nums ={2, 3, 1,0, 2, 5};
		Find f = new Find();
		System.out.println(f.duplicate(nums)); 
	}
}
