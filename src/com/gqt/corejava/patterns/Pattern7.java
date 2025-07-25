package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count:");
		int n=sc.nextInt();
		int a=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(a+"	");
				a++;
			}
			System.out.println();
		}
	}
}