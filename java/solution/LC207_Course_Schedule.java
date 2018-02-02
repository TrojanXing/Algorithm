class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        /***************************************************************
         *                          BFS                                *
         ***************************************************************/
        List<Integer>[] list = new ArrayList[numCourses];
        int[] req = new int[numCourses];
        for(int i = 0; i < numCourses; i++) list[i] = new ArrayList();
        for(int[] edge: prerequisites) { 
            list[edge[1]].add(edge[0]);
            req[edge[0]]++;
        }
        Queue<Integer> queue = new LinkedList();
        int count = 0;
        for(int i = 0; i < numCourses; i++) {
            if(req[i] == 0) {
                queue.offer(i);
                count++;
            }
        }
        while(!queue.isEmpty()) {
            for(int i: list[queue.poll()]) {
                req[i]--;
                if(req[i] == 0) {
                    count++;
                    queue.offer(i);
                }
            }
        }
        return count == numCourses;
        
    }
}