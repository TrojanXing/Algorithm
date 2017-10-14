package solution;

import java.util.PriorityQueue;

public class LC378_Kth_Smallest_Element_in_Sorted_Matrix {
	//Solution1 Priority Queue
    public int kthSmallest1(int[][] matrix, int k) {
		int res = matrix[0][0];
	    PriorityQueue<Helper> queue = new PriorityQueue<Helper>();
	    for(int i = 0; i < matrix.length; i++){
	        queue.offer(new Helper(matrix[i][0], i, 0));
	    }
	    for(int i = 0; i < k - 1; i++){
	        Helper temp = queue.poll();
	        if(temp.c < matrix[0].length - 1){
	            queue.offer(new Helper(matrix[temp.r][temp.c + 1], temp.r, temp.c + 1));
	        }
	    }
	    return queue.poll().val;
	}
    
    //Solution2 Binary Search
    public int kthSmallest2(int[][] matrix, int k) {
    		int lo = matrix[0][0];
        int hi = matrix[matrix.length-1][matrix[0].length-1];
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0;
            int j = matrix[0].length - 1;
            for(int i = 0; i < matrix.length; i++){
                while(j >= 0 && matrix[i][j] > mid){
                    j--;
                }
                count += (j + 1);
            }
            if(count >= k){
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return hi;
    }
}

class Helper implements Comparable<Helper>{
	int r, c, val;
	public Helper(int val, int r, int c){
	    this.r = r;
	    this.c = c;
	    this.val = val;
	}
	
	public int compareTo(Helper a){
	    return this.val - a.val;
	}
}