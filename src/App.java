public class App {
    public static void main(String[] args) throws Exception {
        Trie trie = new Trie();
        trie.search("cats");

        System.out.println("Trie response: " + trie.startsWith("cat"));
        System.out.println("Trie response: " + trie.search("cats"));
    }
}
