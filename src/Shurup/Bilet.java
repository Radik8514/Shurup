package Shurup;

import java.util.Scanner;

public class Bilet {

    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите 6 чисел билета");
        int bil = sqw.nextInt();
        while (bil>999999){
            System.out.println("Некорректно введите 6 чисел билета");
            bil = sqw.nextInt();}
        int a = bil % 1000;
        int b = bil / 1000;
        int s = 0;
        int j = 0;
        do {
            s += a % 10;
            a/=10;
            j += b % 10;
            b/=10;}
        while (a!=0);
        if (s==j){
            System.out.println("Счастливый билет");}
        else {
            System.out.println("Не счастливый билет");}
    }
}
