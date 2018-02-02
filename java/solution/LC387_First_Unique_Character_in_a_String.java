class Solution {
    public int firstUniqChar(String s) {
        char[] letters = s.toCharArray();
        int[] map = new int[128];
        for(char c: letters) {
            map[c]++;
        }
        for(int i = 0; i < letters.length; i++) {
            if(map[letters[i]] == 1) return i;
        }
        return -1;
    }
}