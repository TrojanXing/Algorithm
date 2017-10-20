package java.solution;
//import dataStructure.TrieNode;

public class LC211_Word_Dictionary {
	TrieNode root;
    /** Initialize your data structure here. 
     * @return */
    public void WordDictionary() {
        root = new TrieNode(false);
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for(char c:word.toCharArray()){
            if(cur.children[c - 'a'] == null){
                cur.children[c - 'a'] = new TrieNode(false);
            }
            cur = cur.children[c - 'a'];
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        if(word.length() == 0) return root.isWord;
        TrieNode cur = root;
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(c == '.'){
                TrieNode temp = root;
                boolean hasFound = false;
                for(TrieNode child:cur.children){
                    if(child == null) continue;
                    root = child;
                    hasFound = search(word.substring(i+1));
                    if(hasFound) break;
                }
                root = temp;
                return hasFound;
            } else {
                if(cur.children[c - 'a'] == null){
                    return false;
                } else {
                    cur = cur.children[c - 'a'];
                }
            }
        }
        return cur.isWord;
    }
}


