package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int space = 1; space <= n - i - 1; space++) {
                System.out.print("  ");
            }
            for (char ch = 'A'; ch <= (char)('A' + i); ch++) {
                System.out.print(ch + " ");
            }
            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}