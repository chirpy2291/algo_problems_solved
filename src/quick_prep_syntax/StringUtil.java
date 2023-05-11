package quick_prep_syntax;

public class StringUtil {
	public static void main(String[] args) {
		String str1 = "ssi";
		String str2 = "Mississippi";

		// How to find first/last occurence--> indexof
		System.out.println("First found in : "+str2.indexOf(str1));
		System.out.println("Last found in :"+str2.lastIndexOf(str1));
		
		//Get Ascii values:
		
		//CompareTo
		
		String str3="ississisiis";
		
		System.out.println(str3.compareTo(str1));
		
		//get character integer value
		char ch='b';
		int x=ch;
		System.out.println("Character s value is : "+x);
		
	}

}
