package com.leetcode.trie;

public class TrieMain {
    private TrieNode root;

    public TrieMain() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);
            if (!node.containsKey(curr)) {
                node.put(curr, new TrieNode());
            }
            node = node.get(curr);
        }
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;
    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);
            if (node.containsKey(curr)) {
                node = node.get(curr);
            } else {
                return null;
            }
        }

        return node;
    }

}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
class TrieNode {
    private TrieNode[] links;
    private final int R = 26;
    private boolean isEnd;
    public TrieNode() {
        links = new TrieNode[R];
    }
    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }
    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }
    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}