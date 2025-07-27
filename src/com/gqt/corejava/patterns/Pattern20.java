package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern20 {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter number of rows: ");
		        int r = sc.nextInt();
		        System.out.print("Enter number of underscores: ");
		        int u = sc.nextInt();
		        System.out.print("Enter number of @ symbols: ");
		        int ats = sc.nextInt();
		        for (int i = 1; i <= r; i++)
		        {
		            for (int j = 1; j <= u; j++)
		            {
		                System.out.print("_ ");
		            }
		            for (int k = 1; k <= ats; k++) 
		            {
		                System.out.print("@ ");
		            }
		            System.out.println();
		        }
		        sc.close();
		    }
		}