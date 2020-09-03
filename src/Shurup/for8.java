package Shurup;

import java.util.Scanner;

public class for8 {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        int a = sqw.nextInt();
        for (int i=0;a>i;i++){
          for (int b=i;b<a;b++){
              System.out.print("* ");}
            System.out.println(" ");}
        for (int i=a;i>0;i--){
            for (int b=i;b<a+1;b++){
                System.out.print("* ");}
            System.out.println(" ");}
    }
}
