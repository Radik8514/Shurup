package Shurup;

import java.util.Scanner;

public class naibolschee {
    static Scanner sqr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        int a = sqr.nextInt();
        int b = sqr.nextInt();
        int c = sqr.nextInt();

        if (a>b&&a>c||a==b&&a>c||a==c&&a>b){
            System.out.println(a);}
        if (b>a&&b>c||b==a&&b>c||b==c&&b>a){
            System.out.println(b);}
        if (c>a&&c>b){
            System.out.println(c);}
        if (a==b&&a==c){
            System.out.println("Равны");}
    }
}
//Пользователь вводит три числа. Определить наибольшее из них