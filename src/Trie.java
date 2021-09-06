public class Trie {

    private Node root; 

    /**
     * @author Thando Ncube 
     * @description This is a Trie datastructure implemented here
     * we take this from the leetcode problem asked by Googe, Facebook, Amazon
     * A number of times.
     * @copyright Creative Commons Attribution License     
     * */
    public Trie() {
        root = new Node('\0');
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        Node curr = root; 
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) curr.children[c - 'a'] = new Node(c);
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node !=  null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return getNode(prefix) != null;
    }

    private Node getNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) return null;
            curr = curr.children[c - 'a'];
        }
        return curr;
    }

    class Node {
        public char c;
        public boolean isWord; 
        public Node[] children;

        public Node(char c) {
            this.c = c;
            isWord = false;
            children = new Node[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */