package MakingAnagrams.MakingAnagrams;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int numberNeeded(String first, String second) {
	      
		StringBuilder s1 = new StringBuilder();
		s1.append(first);
		
		StringBuilder s2 = new StringBuilder();
		s2.append(second);
		
		char[] charArray = first.toCharArray();
		for(char c: charArray){
			int lastIndexOf = s2.lastIndexOf(Character.toString(c));
			if(lastIndexOf != -1){
				s2.deleteCharAt(lastIndexOf);
				int index = s1.lastIndexOf(Character.toString(c));
				s1.deleteCharAt(index);
			}
		}
		int length = s1.length() + s2.length();
		return length;
    }
  
    
    public static void main( String[] args )
    {
    	String a="abc";
    	String b="dec";
        System.out.println( numberNeeded(a, b) );
    }
}
