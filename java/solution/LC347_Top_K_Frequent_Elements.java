class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        List<Integer> list = new LinkedList();
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue(new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        });
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            pq.offer(entry);
        }
        for(int i = 0; i < k; i++) {
            list.add(pq.poll().getKey());
        }
        return list;
    }
}