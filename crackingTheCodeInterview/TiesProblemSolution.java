import java.util.HashMap;

class Trie{
	public static TrieNode root;

	public Trie() {
		root = new TrieNode(null);
	}
	
	static int find(String contact) {
		TrieNode current = root;
		int i;
		 int count = 0;
		for (i = 0; i < contact.length(); i++) {
			char charAt = contact.charAt(i);
			String valueOf = String.valueOf(charAt);
			if(current.getChildren().containsKey(valueOf)) {
				current = current.getChildren().get(valueOf);
				count = current.getCount();
				continue;
			}else {
				return 0;
			}
		}
		return count;
	}

	static void insert(String contact) {
		TrieNode current = root;
		int i;
		for (i = 0; i < contact.length(); i++) {
			char charAt = contact.charAt(i);
			String valueOf = String.valueOf(charAt);
			current = current.getChildren().computeIfAbsent(valueOf, c -> new TrieNode(valueOf));
			current.setCount(current.getCount()+1);
			
		}
		current.setWord(true);
	}

}
class TrieNode {
	private HashMap<String, TrieNode> children;

	private String content;

	private boolean isWord;
	
	private int count = 0;

	public HashMap<String, TrieNode> getChildren() {
		return children;
	}

	public void setChildren(HashMap<String, TrieNode> children) {
		this.children = children;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isWord() {
		return isWord;
	}

	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

	public TrieNode(String content) {
		this.content = content;
		this.children = new HashMap<>();
		this.isWord = false;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	

}

public class TiesProblemSolution {
	static Trie trie= new Trie();
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		for (int a0 = 0; a0 < n; a0++) {
//			String op = in.next();
//			String contact = in.next();
//
//			if (op.equalsIgnoreCase("add")) {
		trie.insert("s");
		trie.insert("ss");
		trie.insert("sss");
		trie.insert("ssss");
		trie.insert("sssss");
		System.out.println(trie.find("s"));
		System.out.println(trie.find("ss"));
		System.out.println(trie.find("sss"));
		System.out.println(trie.find("ssss"));
		System.out.println(trie.find("sssss"));
		System.out.println(trie.find("ssssss"));
//				System.out.print(trie.find("car"));
//			} else {
//				System.out.print(trie.find(contact));
//			}
//		}
	}
	
	
}