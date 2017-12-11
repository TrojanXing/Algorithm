class Solution {
    public boolean validPalindrome(String s) {
        int len = s.length();
        if(len <= 1) return true;
        int l = 0, r = len - 1;
        while(l < r) {
            if(s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return isPalindrome(s.substring(l+1, r+1)) || isPalindrome(s.substring(l, r));
            }
        }
        return true;
            
    }
    private boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        char[] c = s.toCharArray();
        int l = 0, r = c.length - 1;
        while(c[l] == c[r] && l <= r) {
            l++;
            r--;
        }
        return r - l < 0;
    }
}