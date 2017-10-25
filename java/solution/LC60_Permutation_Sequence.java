package java.solution;

import java.util.LinkedList;

public class LC60_Permutation_Sequence {
	public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int factorial = 1;
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i <= n; i++) {
            list.add(i);
            factorial *= i;
        }
        k--;
        for(int i = n; i >= 1; i--) {
            factorial /= i;
            sb.append(list.remove(k / factorial));
            k %= factorial;
        }
        return sb.toString();
    }
}
