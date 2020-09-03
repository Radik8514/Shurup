package Shurup;

import java.util.Scanner;

public class for6 {
        public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sqw.nextInt();
        for (int b=0;a>b;b++){
            for (int i=0;i<a;i++){
            System.out.print("* ");}
            System.out.println(" ");
        }
    }
}
