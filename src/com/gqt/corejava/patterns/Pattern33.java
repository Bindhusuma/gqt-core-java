package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = (char)(64 + i); 
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}