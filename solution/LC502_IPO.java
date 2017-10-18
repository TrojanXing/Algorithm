package solution;

import java.util.PriorityQueue;

public class LC502_IPO {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        int len = Capital.length;
        int res = W;
        int[][] pairs = new int[len][2];        
        PriorityQueue<int[]> pqPro = new PriorityQueue<int[]>((a, b) -> (b[0] - a[0]));
        PriorityQueue<int[]> pqCap = new PriorityQueue<int[]>((a, b) -> (a[1] - b[1]));
        for(int i = 0; i < len; i++){
            pairs[i] = new int[]{Profits[i], Capital[i]};
            pqCap.offer(pairs[i]);
        }
        
        for(int i = 0; i < k; i++){
            while(!pqCap.isEmpty() && res >= pqCap.peek()[1]){
                pqPro.offer(pqCap.poll());
            }
            if(pqPro.isEmpty()){
                break;
            } else {
                int[] next = pqPro.poll();
                res += next[0];
            }
        }
        return res;
    }
}
