package Shurup;

import java.util.Scanner;
public class chetnechet {
    static Scanner sqr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int a = sqr.nextInt();
        if (a%2==0){
            System.out.println("Четное число");
        }
        else {
            System.out.println("Нечетное число");
        }
        }
    }