package top_interview_leetcode_easy;

/*
 * input={'flower','flow','flight'} return 'fl'
 * 
 *  
 * else return ""
 * 
 * We could optimize LCP queries by storing the set of keys S in a Trie. 
 * For more information about Trie, please see this article Implement a trie (Prefix trie).
 */

//horizontal scanning .Complexity : O(n) Space : O(1)
public class longestCommonPrefix {

	public static void main(String[] args) {
		String str[]= {"flower","flow","flight"};
		
		String prefix=str[0];
		
		for(int i=1;i<str.length;i++)
		{
			System.out.print("Checking preifx against index :"+i+" for '"+str[i]+"'");
			while(str[i].indexOf(prefix)!=0)
			{
				prefix=prefix.substring(0,prefix.length()-1);
				System.out.println("\n"+prefix);
				
				if(prefix.isEmpty())
					{
					System.out.println("Not found any  prefix!!");
					break;
					}
					
				}
			System.out.print("prefix is : "+prefix);
			
		}
	}
}
