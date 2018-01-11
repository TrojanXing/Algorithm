
class LC74_Search_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0 || target < matrix[0][0]) return false;
        int h = matrix.length, w = matrix[0].length;
        int lo = 0, hi = h * w - 1;
        int mid = 0;
        while(lo != hi) {
            mid = (lo + hi - 1) >> 1;
            if(matrix[mid/w][mid%w] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return matrix[hi/w][hi%w] == target;
    }
}