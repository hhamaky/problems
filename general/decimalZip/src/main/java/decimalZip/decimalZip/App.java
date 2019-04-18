package decimalZip.decimalZip;

/**
 * Decimal Zip problem.
 * The decimal zip of two non-negative integers A and B is an integer C whose 
 decimal representation is created from the decimal representations
 of A and B as follows:

• the first (i.e. the most significant) digit of C is the first digit of A;
• the second digit of C is the first digit of B;
• the third digit of C is the second digit of A;
• the fourth digit of C is the second digit of B;
• etc.

 If one of the integers A and B runs out of digits, the remaining digits of 
 the other integer are appended to the result.

 The decimal representation of 0 is assumed to be "0".

 For example, the decimal zip of 12 and 56 is 1526.
 The decimal zip of 56 and 12 is 5162.
 The decimal zip of 12345 and 678 is 16273845.
 The decimal zip of 123 and 67890 is 16273890.

 Write a function: function solution(A, B); that, given two non-negative
 integers A and B, returns their decimal zip.

 The function should return -1 if the result exceeds 100,000,000.

 For example, given A = 12345 and B = 678 the function should return 
 16273845, as explained above.
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a = 123;
    	int b = 0; 
        System.out.println( solution(a,b) );
    }
    
    public static int solution(int A, int B) {
    	int aLength = String.valueOf(A).length();
    	int bLength = String.valueOf(B).length();
    	StringBuilder C= new StringBuilder();
    	C.append(String.valueOf(A));
    	String b = String.valueOf(B);
    	int j=1;
    	for(int i=0;i<bLength;i++){
    		C.insert(j, b.charAt(i));
    		j=j+2;
    		if(j>aLength){
    			C.append(b.substring(i+1,b.length()));
    			break;
    		}
    		
    	}
        return Integer.valueOf(C.toString());
    }
}
