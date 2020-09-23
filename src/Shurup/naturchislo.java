package Shurup;

import java.util.Scanner;

public class naturchislo {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sqw.nextInt();
        boolean b=true;
        for (int i=2;i<=(int)Math.sqrt(a);i++) {
            if (a % i == 0) {
                b = false;
                break;}
            }
        if (b)
            System.out.println("Составное");
        else
            System.out.println("Простое");
    }
}
