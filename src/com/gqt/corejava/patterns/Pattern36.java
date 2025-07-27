package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int space = 1; space <= n - i - 1; space++) {
                System.out.print("   ");
            }
            for (char ch = (char)('A' + i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            for (char ch = 'B'; ch <= (char)('A' + i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}