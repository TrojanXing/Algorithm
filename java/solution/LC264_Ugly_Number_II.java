package java.solution;

public class LC264_Ugly_Number_II {
	public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int factor2 = 2, factor3 = 3, factor5 = 5;
        int ind2 = 0, ind3 = 0, ind5 = 0;
        for(int i = 1; i < n; i++){
            int cur = Math.min(Math.min(factor2, factor3), factor5);
            ugly[i] = cur;
            if(cur == factor2) {
                factor2 = 2 * ugly[++ind2];
            }
            if (cur == factor3) {
                factor3 = 3 * ugly[++ind3];
            }
            if (cur == factor5) {
                factor5 = 5 * ugly[++ind5];
            }
        }
        return ugly[n-1];
    }
}
