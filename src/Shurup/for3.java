package Shurup;

import java.util.Scanner;

public class for3 {
        public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sqw.nextInt();
        for (int b=1;a>b;b++){
            System.out.print(b+", ");
        }
            System.out.println(a);
    }
}
