package Shurup;

import java.util.Scanner;
public class Stakanchik {
    static Scanner sqr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        int a = sqr.nextInt();
        int b = sqr.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println(a +" "+b);
    }
}