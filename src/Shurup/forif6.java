package Shurup;

import java.util.Scanner;

public class forif6 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+1>=n-j&&j>=i) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
