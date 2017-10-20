package java.solution;

import java.util.Arrays;

public class LC455_Assign_Cookis {
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        for(int i:s){
            if(i >= g[child]){
                child++;
            }
            if(child == g.length){
                return child;
            }
        }
        return child;
	}
}
