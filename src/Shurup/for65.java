package Shurup;

import java.util.Scanner;

public class for65 {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите число ширины");
        int m = sqw.nextInt();
        System.out.println("Введите число высоты");
        int n = sqw.nextInt();

        for (int b=0;n>b;b++){
            for (int i=0;i<m;i++){
                System.out.print("* ");}
            System.out.println(" ");
        }
    }
}
