class LC171_Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
        int res = 0;
        int weight = 1;
        char[] c = s.toCharArray();
        for(int i = c.length - 1; i >= 0; i--) {
            res += (c[i] - 'A' + 1) * weight;
            weight *= 26;
        }
        return res;
    }
}