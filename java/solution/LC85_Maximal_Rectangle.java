class Solution {
    public int maximalRectangle(char[][] matrix) {
        int res = 0;
        if(matrix.length == 0 || matrix[0].length == 0) return res;
        int h = matrix.length, w = matrix[0].length;
        int[] left = new int[w];
        int[] right = new int[w];
        int[] height = new int[w];
        Arrays.fill(right, w);
        for(int r = 0; r < h; r++) {
            int cur_l = 0, cur_r = w;
            for(int c = 0; c < w; c++) {
                if(matrix[r][c] == '1') {
                    height[c]++;   
                    left[c] = Math.max(left[c], cur_l);
                } else {
                    height[c] = 0;
                    left[c] = 0;
                    cur_l = c + 1;
                }
            }
            for(int c = w-1; c >= 0; c--) {
                if(matrix[r][c] == '1') {
                    right[c] = Math.min(right[c], cur_r);
                    res = Math.max(height[c] * (right[c] - left[c]), res);
                } else {
                    cur_r = c;
                    right[c] = w;
                }
            }
        }
        return res;
    }
}