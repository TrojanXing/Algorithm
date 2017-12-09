class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            pq.add(nums[i]);
            if(i >= k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}