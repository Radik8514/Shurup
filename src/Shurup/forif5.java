package Shurup;

import java.util.Scanner;

public class forif5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j>=n-i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
