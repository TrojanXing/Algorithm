package java.solution;

public class LC459_Repeated_Substring_Pattern {
	public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int l = len/2; l > 0; l--) {
            if(len % l != 0) continue;
            String fir = s.substring(0, l);
            for(int i = 1; i < len / l; i++) {
                if(!s.substring(l * i, l * (i + 1)).equals(fir)) {
                    break;
                } else {
                    if(i == len / l - 1) return true;
                }
            }
        }
        return false;
    }
}
