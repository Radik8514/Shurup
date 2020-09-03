package Shurup;

import java.util.Scanner;

public class for7 {

    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sqw.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.println(i);}
        for (int b = 2; a >= b; b++) {
            System.out.println(b + " ");
        }
    }
}
