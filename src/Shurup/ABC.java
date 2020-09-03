package Shurup;

import java.util.Scanner;
public class ABC {

    public static void main(String[] args) {
        Scanner sqr = new Scanner(System.in);
        System.out.println("Введите три числа: ");
        int a = sqr.nextInt();
        int b = sqr.nextInt();
        int c = sqr.nextInt();
        System.out.println(a+b*c);
    }
}