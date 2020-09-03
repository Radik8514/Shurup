package Shurup;

import java.util.Scanner;
public class vklad {
    static Scanner sqr = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("рублей на вклад");
        int a = sqr.nextInt();
        System.out.println("на  месяцев");
        int b = sqr.nextInt();
        System.out.println("процентов годовых");
        double c = sqr.nextInt();

        double d = c/12;
        double e = a*(1+d*b/100);
        System.out.println("Процент в месяц: "+d);
        System.out.println("Сумма по истечении: "+e);
    }
}
//здесь итоговый процент все равно немного неправильный.
// мы складываем деньги с проценто-месяцами, а надо с деньгами,
// которые являются процентом от исходной суммы за данное количество месяцев.
// по сути, исправить надо только в 13 строке