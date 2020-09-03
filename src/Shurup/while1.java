package Shurup;

import java.util.Scanner;

public class while1 {
        public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("введите число");
        int a = sqw.nextInt();
        int b=0;
        while (a!=0){
          b+=a%10;
          a/=10;
        }
        System.out.println(b);
    }
}
