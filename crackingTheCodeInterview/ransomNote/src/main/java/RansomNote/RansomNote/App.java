package RansomNote.RansomNote;

import java.util.Hashtable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int m=6;
    	int n=4;
    	String magazine[] = {"give","me", "one", "grand", "today", "night"};
    	String ransome[] =  {"give", "one", "one", "today"};	
    	
        int count = 1;
    	Hashtable<String, Integer> mag = new Hashtable<String, Integer>();
    	for(int m_=0; m_ < m; m_++){
    		
    		if(mag.containsKey(magazine[m_])){
    			count = mag.get(magazine[m_]);
    			mag.put(magazine[m_], ++count);
    		}else{
    		mag.put(magazine[m_], count);
    		}
        }
    	
    	for(int r_=0; r_ < n; r_++){
    		if(!mag.containsKey(ransome[r_])){
    			System.out.println("No");
    			return;
    		}else{
    			//removeOrDecCount
    			int value = mag.get(ransome[r_]);
    			if(value == 1){
    				mag.remove(ransome[r_]);
    			}else{
    				mag.put(ransome[r_], --value);
    			}
    		}
    	}
    	System.out.println("Yes");
    }
}
