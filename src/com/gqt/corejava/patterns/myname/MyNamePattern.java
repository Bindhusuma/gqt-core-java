package com.gqt.corejava.patterns.myname;
import java.util.Scanner;
/**
 * @author Bindhusuma
 * @category patterns
 * @description This is an example for pyramid pattern
 */
public class MyNamePattern {
	/**
	 * @param args
	 * @description This contains source code for the pattern
	 */
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the size: ");
				int n = sc.nextInt();
				System.out.println();

				for (int i = 0; i < n; i++) {
					// Letter B
					for (int j = 0; j < n; j++) {
						if (j == 0 || (i == 0 || i == n / 2 || i == n - 1) && j < n - 1 || j == n - 1 && (i != 0 && i != n / 2 && i != n - 1))
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.print("   ");

					// Letter I
					for (int j = 0; j < n; j++) {
						if (i == 0 || i == n - 1 || j == n / 2)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.print("   ");

					// Letter N
					for (int j = 0; j < n; j++) {
						if (j == 0 || j == n - 1 || i == j)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.print("   ");

					// Letter D
					for (int j = 0; j < n; j++) {
						if (j == 0 || (i == 0 || i == n - 1) && j < n - 1 || j == n - 1 && i != 0 && i != n - 1)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.print("   ");

					// Letter H
					for (int j = 0; j < n; j++) {
						if (j == 0 || j == n - 1 || i == n / 2)
							System.out.print("# ");
						else
							System.out.print("  ");
					}
					System.out.print("   ");

					// Letter U
					for (int j = 0; j < n; j++) {
						if ((j == 0 && i != n - 1) || (j == n - 1 && i != n - 1) || (i == n - 1 && j > 0 && j < n - 1))
							System.out.print("# ");
						else
							System.out.print("  ");
					}

					System.out.println();
				}
			}
		}