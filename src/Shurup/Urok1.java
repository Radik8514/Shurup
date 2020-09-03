package Shurup;

import java.util.Scanner;
public class Urok1 {
static Scanner sqr = new Scanner(System.in);
public static void main (String[] args ){
        System.out.print("Введите первое число: ");
        int a = sqr.nextInt();
        System.out.print("Введите второе число: ");
        int b = sqr.nextInt();
        a = a+b;
        b = a-b;
        a-= b;
        System.out.println("Числа наоборот:");
        System.out.println("Первое число = "+ a +","+"Второе число = "+ b);
        }
}