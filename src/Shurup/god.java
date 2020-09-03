package Shurup;

import java.util.Scanner;

public class god {
    static Scanner sqr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = sqr.nextInt();

        if(a%4==0 && a%100 !=0 || a%400==0){
           System.out.println("Высокостный : " + a);}
           else {
            System.out.println("Не высокостный :" + a);}
    }
}