package Shurup;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("введите число");
        int a = sqw.nextInt();
        int b=0;
        while (a!=0){
            b+=a;
            a =sqw.nextInt();
        }
        System.out.println(b);
    }
}
