class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] root = new int[2001];
        for(int i = 0; i < root.length; i++) root[i] = i;
        // Arrays.sort(edges, new Comparator<int[]>() {
        //     public int compare(int[] a, int[] b) {
        //         return a[0] - b[0];
        //     }
        // });
        
        for(int[] edge: edges) {
            int p = edge[0];
            int c = edge[1];
            if(findRoot(root, p) == findRoot(root, c)) return edge;
            else root[findRoot(root, p)] = findRoot(root, c);
        }
        return new int[2];
    }
    
    private int findRoot(int[] root, int t) {
        if(root[t] != t) {
            root[t] = findRoot(root, root[t]);
        }
        return root[t];
    }
}