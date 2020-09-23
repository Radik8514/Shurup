package Shurup;

import java.util.Scanner;

public class whilfact {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        int a = sqw.nextInt();
        int b=1,c=1;
        while (b<=a){
            c=c*b;
            b++;}
        System.out.println(c);
        }
    }
