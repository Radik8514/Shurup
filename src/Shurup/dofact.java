package Shurup;

import java.util.Scanner;

public class dofact {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        int a = sqw.nextInt();
        int b = 1,c = 1;
        do {
            c=c*b;
            b++;}
            while (b<=a);
            System.out.println(c);
    }
}
