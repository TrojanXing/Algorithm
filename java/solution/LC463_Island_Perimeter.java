package java.solution;

public class LC463_Island_Perimeter {
	public int islandPerimeter(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int island = 0;
        int neig = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(grid[i][j] == 1) {
                    island++;
                    if(i > 0 && grid[i-1][j] == 1) neig++;
                    if(j > 0 && grid[i][j-1] == 1) neig++;
                    // if(i == 0 || grid[i-1][j] == 0) res++;
                    // if(i == r-1 || grid[i+1][j] == 0) res++;
                    // if(j == 0 || grid[i][j-1] == 0) res++;
                    // if(j == c-1 || grid[i][j+1] == 0) res++;
                }
            }
        }
        return (island << 2) - (neig << 1);
    }
}
