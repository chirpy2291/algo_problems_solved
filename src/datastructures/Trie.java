package datastructures;

//read up in geeks for geeks
class TrieNode{
	static final int ALPHABET_SIZE = 26;
	boolean isLeaf;
	TrieNode[] nodeArr;

	TrieNode() {
		isLeaf = false;
		nodeArr = new TrieNode[ALPHABET_SIZE];
		for (int i = 0; i < ALPHABET_SIZE; i++)
			nodeArr[i] = null;
	}

	public boolean isLeaf() {
		return isLeaf;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public TrieNode[] getNodeArr() {
		return nodeArr;
	}

	public void setNodeArr(TrieNode[] nodeArr) {
		this.nodeArr = nodeArr;
	}

}

public class Trie {

	static TrieNode root;

	Trie() {
		root = new TrieNode();
	}

	public static void insert(String key) {

		TrieNode pCrawl = root;
		int index;

		for (int i = 0; i < key.length(); i++) {

			index = key.charAt(i) - 'a';
			if (pCrawl.nodeArr[index] == null) {
				// add the character and continue
				pCrawl.nodeArr[index] = new TrieNode();
				pCrawl = pCrawl.nodeArr[index];

			} else {
				pCrawl = pCrawl.nodeArr[index];
			}

		}
		pCrawl.isLeaf = true;

	}

	public static boolean search(String key) {
		int index;
		TrieNode pCrawl=root;
		
		for (int i = 0; i < key.length(); i++) {
			index = key.charAt(i) - 'a';

            if (pCrawl.nodeArr[index] == null)
            	return false;
             pCrawl=pCrawl.nodeArr[index];
      

		}
		return pCrawl.isLeaf;
	}

	public static void main(String[] args) {

		Trie node = new Trie();

		String keys[] = { "the", "a", "there", "answer", "any", "by", "bye", "their" };
		for (int i = 0; i < keys.length; i++) {
			insert(keys[i]);
		}
		System.out.println("So the Trie is ready to be searched\n");
		System.out.println("\nSearching for key :  answer \n");
		System.out.println("Found : " + search("answer")+"\n");

		System.out.println("Searching for key :  ans \n");
		System.out.println("Found : " + search("ans")+"\n");

		System.out.println("Searching for key :  bae \n");
		System.out.println("Found : " + search("bae")+"\n");
		
		System.out.println("Searching for key :  their \n");
		System.out.println("Found : " + search("their")+"\n");

	}
}
