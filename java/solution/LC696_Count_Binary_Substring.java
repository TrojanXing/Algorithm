class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0;
        char[] c = s.toCharArray();
        int pre = 0, cur = 1;
        for(int i = 1; i < s.length(); i++) {
            if(c[i] != c[i-1]) {
                pre = cur;
                cur = 1;
            } else {
                cur++;
            }
            if(pre >= cur) res++;
        }
        return res;
    }
}