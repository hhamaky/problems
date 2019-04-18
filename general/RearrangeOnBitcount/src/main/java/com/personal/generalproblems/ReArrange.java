package com.personal.generalproblems;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class ReArrange 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    static int[] rearrange(int[] elements) 
    {
    	
    	int i;
    	int j = 0;
    	for(i=0; i<elements.length;i++){
    		if (i!=elements.length-1){
    		int x = Integer.bitCount(elements[i]);
    		
    		int y = Integer.bitCount(elements[i+1]);
    		if(x>y){
    			elements[i+1] = x;
    			elements[i] = y;
    		}else if (x == y){
    			if(elements[i] >elements[i+1]){
    				int z = elements[i+1];
    				elements[i+1] =  elements[i];
    				elements[i] = z;
    			}
    		}
    		
    	}
    	}
		return elements;


    }
}
