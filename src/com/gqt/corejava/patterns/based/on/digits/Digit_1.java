/**
 * 
 */
package com.gqt.corejava.patterns.based.on.digits;
import java.util.Scanner;
/**
 * 
 */
public class Digit_1{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the size: ");
		        int n = sc.nextInt();
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                if (i+j==(n/2) || j==(n/2) || i==(n-1))
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