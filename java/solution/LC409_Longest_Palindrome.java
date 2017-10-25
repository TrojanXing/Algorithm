package java.solution;

public class LC409_Longest_Palindrome {
	public int longestPalindrome(String s) {
        int[] count = new int[128];
        int res = 0; 
        int odd = 0;
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        for(int i = 65; i < 128; i++) {
            if(odd == 0 && count[i] % 2 == 1) odd++;
            res += (count[i] & 0xfffffffe);
        }
        return res + odd;
    }
}
