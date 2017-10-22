package java.solution;

public class LC132_Palindrome_Partitioning_II {
	public int minCut(String s) {
        char[] c = s.toCharArray();
        int[] cut = new int[c.length];
        boolean[][] pal = new boolean[c.length][c.length];
        
        for(int i = 0; i < c.length; i++) {
            int min = i;
            for(int j = 0; j <= i; j++) {
                if((c[j] == c[i]) && (j + 1 >= i - 1 || pal[j+1][i-1])) {
                    pal[j][i] = true;
                    min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);
                }
            }
            cut[i] = min;
        }
        return cut[c.length - 1];  
    }
}
