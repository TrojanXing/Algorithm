class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, max = 0;
        boolean[] exist = new boolean[128];
        char[] chars = s.toCharArray();
        while(right < chars.length) {
            if(exist[chars[right]]) {
                while(left < right && chars[left++] != chars[right]) {
                    exist[chars[left-1]] = false;   
                }
            }
            exist[chars[right++]] = true;    
            max = Math.max(right - left, max);  
        }
        return max;
    }
}