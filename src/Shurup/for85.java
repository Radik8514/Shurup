package Shurup;

import java.util.Scanner;

public class for85 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число ");
        int a = scanner.nextInt();
        for (int b = a; b >0; b-=2){
            for (int c = b; c < a; c++)
                System.out.print("");
            for (int c = 0; c <=b; c++)
                if (c == 0 || c == b)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println(); }

        for (int b = 2; b <=a; b+=2){
            for (int c = b; c < a; c++)
                System.out.print("");
            for (int c = 0; c <=b; c++)
                if (a%2==0)
                    if (c ==b || c==0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                    else
                if (c ==b || c==0)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            System.out.println(); }
    }
}


