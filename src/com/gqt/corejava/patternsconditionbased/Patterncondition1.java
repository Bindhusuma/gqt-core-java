/**
 * # # # # #
 * # - - - #
 * # - - - #
 * # - - - #
 * # # # # #
 */
package com.gqt.corejava.patternsconditionbased;
import java.util.Scanner;
/**
 * @author BindhuSuma
 * @category Patterns based on condition
 * @description This is an example for Conditional based patterns
 */
public class Patterncondition1 {

	/**
	 * @param args
	 * @description This contains Source code for the pattern
	 */
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enetr the size:");
	        int n =sc.nextInt();
	        for(int i=0;i<n;i++)
	        {
	        	for(int j=0;j<n;j++)
	        	{
	        		if(i==0 || i==n-1 || j==0 || j==n-1)
	        		{
	        			System.out.print("#  ");
	        		}
	        		else
	        		{
	        			System.out.print("-  ");
	        		}
	        		}System.out.println();
	        	}
	    }
}