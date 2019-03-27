package suanfa;
/**
 * 二分查找
 * 又叫折半查找，要求待查找的序列有序。
 * 每次取中间位置的值与待查关键字比较，如果中间位置的值比待查关键字大，则在前半部分循环这个查找的过程，
 * 如果中间位置的值比待查关键字小，则在后半部分循环这个查找的过程。
 * 直到查找到了为止，否则序列中没有待查的关键字。
 * @author feiben
 *
 */
public class ErFenChaZhao {
	public static void main(String[] args) {
		int[] array= {1,3,3,5,7,7,7,8,14,14};
		
		System.out.println(biSearch(array, 5));
	}
	/**
	 * 非递归实现
	 * @param array
	 * @param a
	 * @return
	 */
	public static int biSearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<=hi){
        	//取得中间位置的下标
            mid=(lo+hi)/2;
            System.out.println("中间位置的下标+mid>>>"+mid);
            if(array[mid]==a){
            	System.out.println("mid+1>>>"+(mid+1));
                return mid+1;
            }else if(array[mid]<a){
                lo=mid+1;
                System.out.println("lo>>>"+(mid+1));
            }else{
                hi=mid-1;
                System.out.println("hi>>>"+(mid-1));
            }
        }
        return -1;
    }
	
	/**
	 * 递归实现
	 */
	public static int sort(int []array,int a,int lo,int hi){
        if(lo<=hi){
            int mid=(lo+hi)/2;
            if(a==array[mid]){
                return mid+1;
            }
            else if(a>array[mid]){
                return sort(array,a,mid+1,hi);
            }else{
                return sort(array,a,lo,mid-1);
            }
        }
        return -1;
    }
	/**
	 * 
	 * @param array
	 * @param a
	 * @return
	 */
	public static int biSearch1(int []array,int a){
        int n=array.length;
        int low=0;
        int hi=n-1;
        int mid=0;
        while(low<hi){
            mid=(low+hi)/2;
            if(array[mid]<a){
                low=mid+1;
            }else{
                hi=mid;
            }
        }
        if(array[low]!=a){
            return -1;
        }else{
            return low;
        }
    }
	
	/**
	 * 查询元素最后一次出现的位置
	 * @param array
	 * @param a
	 * @return
	 */
	public static int biSearch2(int []array,int a){
        int n=array.length;
        int low=0;
        int hi=n-1;
        int mid=0;
        while(low<hi){
            mid=(low+hi+1)/2;
            if(array[mid]<=a){
                low=mid;
            }else{
                hi=mid-1;
            }
        }
    
        if(array[low]!=a){
            return -1;
        }else{
            return hi;
        }
    }
}
