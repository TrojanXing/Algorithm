package java.solution;

public class LC389_Find_the_Difference {
    public char findTheDifference(String s, String t) {
        int[] count = new int[128];
        for(char c : s.toCharArray()) {
            count[c] ++;
        }
        for(char c : t.toCharArray()) {
            count[c] --;
        }
        for(int i = 'a'; i <= 'z'; i++) {
            if(count[i] == -1) return (char)i;
        }
        return 'a';
    }
}

