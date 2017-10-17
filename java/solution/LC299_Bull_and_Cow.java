package solution;

public class LC299_Bull_and_Cow {
    public String getHint(String secret, String guess) {
        String hint = "";
        if(secret.length() == 0) return hint;
        int bull = 0, cow = 0;
        int[] count = new int[10];
        char[] s = secret.toCharArray();
        char[] g = guess.toCharArray();
        for(int i = 0; i < s.length; i++){
            if(s[i] == g[i]){
                bull++;
            } else {
                if(count[s[i] - '0']++ < 0){
                    cow++;
                }
                if(count[g[i] - '0']-- > 0){
                    cow++;
                }
            }
        }
        return bull + "A" + cow + "B";
    }
}