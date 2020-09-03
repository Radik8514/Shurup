package Shurup;

import java.util.Scanner;

public class for9 {

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ведите число ");
            int a = scanner.nextInt();
            for (int b = a; b > 1; b -= 2) {
                for (int c = 0; c < (a - b) / 2; c++)
                    System.out.print(" ");
                for (int c = 0; c < b; c++)
                    System.out.print("*");
                System.out.println();
            }
            for (int b = 0; b <= a; b += 2) {
                for (int c = 0; c < (a - b) / 2; c++)
                    System.out.print(" ");
                for (int c = 0; c <= b; c++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
