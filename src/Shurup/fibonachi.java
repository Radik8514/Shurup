package Shurup;

import java.util.Scanner;

public class fibonachi {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println();
        int a=sqw.nextInt();
        int b=0,c=1,d;
        for (int i=1;i<a;i++){
            d=b+c;
            b=c;
            c=d;}
        System.out.println(c);
        }
    }
