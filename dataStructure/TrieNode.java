package dataStructure;

public class TrieNode {
	public boolean isWord;
    public TrieNode[] children = new TrieNode[26];
    public TrieNode(boolean isWord){
        this.isWord = isWord;
    }
}
