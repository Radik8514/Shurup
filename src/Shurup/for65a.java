package Shurup;

import java.util.Scanner;
public class for65a {
    public static void main(String[] args) {
        Scanner sqw =new Scanner(System.in);
        System.out.println("Введите число ширины");
        int m = sqw.nextInt();
        System.out.println("Введите число высоты");
        int n = sqw.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n)
                    System.out.print("* ");
                else if (j == 1 || j == m)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}