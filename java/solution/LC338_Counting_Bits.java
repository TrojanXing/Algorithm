package java.solution;

public class LC338_Counting_Bits {
	public int[] countBits(int num) {
        int[] res = new int[num + 1];
        int weight = 1;
        for(int i = 1; i <= num; i++){
            res[i] = 1 + res[i-weight];
            if(i + 1 == weight << 1){
                weight <<= 1;
            }
        }
        return res;
    }
}
