/**
 * 
 */
package com.gqt.corejava.patternsconditionbased;
import java.util.Scanner;
/**
 * 
 */
public class Pattern_W{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the size: ");
		        int n = sc.nextInt();
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j <= n * 2; j++) {
		                if (j == 0 || j == n * 2 || (i == j - n && j >= n) || (i == n - j && j <= n))
		                 {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		        sc.close();
		    }
		}