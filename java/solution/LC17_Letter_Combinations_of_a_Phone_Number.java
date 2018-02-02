class Solution {
    private final char[][] kb = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f',}, 
                                {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
                                {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList();
        if(digits.length() == 0) return res;
        backtrack(digits, res, new StringBuilder(), 0);
        return res;
    }
    
    private void backtrack(String digits, List<String> res, StringBuilder sb, int ind) {
        if(ind == digits.length()) {
            res.add(sb.toString());
            return;
        }
        int dig = digits.charAt(ind) - '0';
        for(int i = 0; i < kb[dig].length; i++) {
            sb.append(kb[dig][i]);
            backtrack(digits, res, sb, ind + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}