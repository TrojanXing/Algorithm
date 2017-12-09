class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int bottom = matrix.length - 1;
        int left = 0;
        while(left < matrix[0].length && bottom >= 0) {
            if(matrix[bottom][left] == target) return true;
            else if(matrix[bottom][left] > target) {
                bottom--;
            } else {
                left ++;
            }
        }
        return false;
    }
}