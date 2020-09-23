package Shurup;
import java.util.Scanner;

public class facproverka {
    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int n = sqw.nextInt();
        System.out.println("Введите второе число ");
        int m = sqw.nextInt();
        int a,b = 1,c = 1,d = 1;
        while (n<=m) {
            System.out.println("Ошибка введите повторно");
            n = sqw.nextInt();
            System.out.println("Введите второе число ");
            m = sqw.nextInt();}
        for (int j = 1; j <= n; j++) {
            b *= j;}
            System.out.println(b);
        for (int e = 1; e <= m; e++) {
            c *= e;}
            System.out.println(c);
        for (int i = 1; i <= n - m; i++) {
            d *= i;}
            System.out.println(d);
        a = b/(c*d);
        System.out.println(a);
    }
}
