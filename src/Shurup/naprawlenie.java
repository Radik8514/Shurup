package Shurup;

import java.util.Scanner;

public class naprawlenie {
    static Scanner sqr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        int a = sqr.nextInt();
        int b = sqr.nextInt();
        int c = sqr.nextInt();
        if (c<a){
            System.out.println("левее а");}
        else if (b<c){
            System.out.println("левее b");}
        else if (a<c&&c<b){
            System.out.println("между a и b");}
        else if (a==c){
            System.out.println("на точке a");}
        else {
            System.out.println("на точке b");
        }
    }
}
// На числовой прямой заданы точки a и b.
// При этом гарантируется, что b > a (a и b вводятся с клавиатуры).
// Пользователь вводит число c.
// Необходимо определить, c находится: левее a, правее b, между a и b, на точке a или на точке b.