/**
 * - - - - -$
 * - - - - $ $ $
 * 
 * 
 * 
 * - - - $ $ $ $ $
 * - -$ $ $ $ $ $ $
 * - $ $ $ $ $ $ $ $ $
 */
package com.gqt.corejava.patternsconditionbased;
import java.util.Scanner;
/**
 - - - - - $
 */
public class Patterncondition3 {

	/**@author BindhuSuma
	 * @description this pattern is based on condition and this one involved with pyramid 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("-  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("$  ");
			}
			System.out.println();
		}
	}
}