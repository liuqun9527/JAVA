package test;
/**
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 * @author feiben
 * 
 * 解题思路
 * 		要求时间复杂度 O(M + N)，空间复杂度 O(1)。

该二维数组中的一个数，它左边的数都比它小，下边的数都比它大。因此，从右上角开始查找，就可以根据 target 和当前元素的大小关系来缩小查找区间，当前元素的查找区间为左下角的所有元素
 *
 */
public class ErWeiShuZu {

	public static void main(String[] args) {
		ErWeiShuZu f = new ErWeiShuZu();
		int[][] arr ={{1, 4, 7, 11, 15},{2, 5, 8, 12, 19},{3, 6, 9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
		System.out.println( f.check(arr, 3));
		
	}
	
	public boolean Find(int target, int[][] matrix) {
	    if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
	        return false;
	    //
	    int rows = matrix.length, cols = matrix[0].length;
	    int r = 0, c = cols - 1; // 从右上角开始
	    while (r <= rows - 1 && c >= 0) {
	        if (target == matrix[r][c])
	            return true;
	        else if (target > matrix[r][c])
	            r++;
	        else
	            c--;
	    }
	    return false;
	}
	
	public boolean check(int[][] arrs,int target) {
		if(arrs.length<=0 || arrs[0].length<=0) 
			return false;
		for(int i=0;i<arrs.length;i++) {
			for(int j=arrs[i].length-1;j>=0;j--) {
				if(target==arrs[i][j]) {
					return true;
				}
				if(target>arrs[i][j]) {
					break;
				}
			}
		}
		return false;
		
	}
}
