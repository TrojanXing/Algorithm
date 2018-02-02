class Solution {
    List<String> list = new LinkedList();
    Map<String, PriorityQueue<String>> map = new HashMap();
    public List<String> findItinerary(String[][] tickets) {    
        for(String[] airline: tickets) {
            if(map.containsKey(airline[0])) {
                map.get(airline[0]).offer(airline[1]);
            } else {
                PriorityQueue<String> pq = new PriorityQueue();
                pq.offer(airline[1]);
                map.put(airline[0], pq);
            }
        }
        visit("JFK");
        return list;
    }
    
    private void visit(String cur) {
        while(map.containsKey(cur) && map.get(cur).size() != 0) {
            visit(map.get(cur).poll());
        }
        list.add(0, cur);
    }
}