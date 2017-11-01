package java.solution;

public abstract class LC557_Reverse_Words {
	public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] words = s.split(" ");
        for(String word : words) {
            StringBuilder temp = new StringBuilder(word);
            res.append(temp.reverse()).append(" ");
        }
        return res.toString().trim();
    }
}
