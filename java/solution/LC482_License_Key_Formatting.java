class Solution {
    public String licenseKeyFormatting(String S, int K) {
        char[] cs = S.replace("-", "").toUpperCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = cs.length - 1, count = 0; i >= 0; i--) {
            sb.append(cs[i]);
            count++;
            if(count == K && i != 0) {
                sb.append('-');
                count = 0;
            }
        }
        return sb.reverse().toString();
    }
}