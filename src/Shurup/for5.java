package Shurup;

import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sqw.nextInt();
        for (int b=0;a>b;b++){
            System.out.print("* ");
        }
    }
}