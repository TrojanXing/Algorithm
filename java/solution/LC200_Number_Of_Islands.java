package java.solution;

public class LC200_Number_Of_Islands {
	int[][] move = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int res = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    dfs(grid, r, c);
                    res++;
                }
            }
        }
        return res;
    }
    private void dfs(char[][] grid, int r, int c){
        grid[r][c] = '0';
        for(int[] m:move){
            int nr = r + m[0];
            int nc = c + m[1];
            if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && 
               grid[nr][nc] == '1'){
                dfs(grid, nr, nc);
            }
        }
        return;
    }
}
