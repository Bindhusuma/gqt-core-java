package com.gqt.corejava.patterns;
import java.util.Scanner;
public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of levels (e.g., 5): ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            int count = 2 * i - 1;
            for (int j = 0; j < count; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }
            int count = 2 * i - 1;
            for (int j = 0; j < count; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}