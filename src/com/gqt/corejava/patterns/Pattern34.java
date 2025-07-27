package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char startChar = (char)(64 + (2 * i - 1));
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            for (char ch = startChar; ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}