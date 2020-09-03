package Shurup;

import java.util.Scanner;
public class koren {
    static Scanner sqr = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите три числа: ");
        double a = sqr.nextDouble();
        double b = sqr.nextDouble();
        double c = sqr.nextDouble();
        double x;

        if (a == 0 && b == 0) {
            if (c == 0) {
                System.out.println("Множество решений");}
            else{
                System.out.println("Нет решений");
                }
            } else if (a == 0) {
                x = -c / b;
                System.out.println(x);
            } else {
                double d = b * b - 4 * a * c;
                if (d == 0) {
                    x = -b / (2 * a);
                    System.out.println("Один корень: " + x);
                } else {
                    if (d > 0) {
                        double x1 = (-b - Math.sqrt(d)) / (2 * a);
                        double x2 = (-b + Math.sqrt(d)) / (2 * a);
                        System.out.println("Корень: " + x1 + "Корень: " + x2);
                    } else {
                        System.out.println("Корней нет");
                    }
                }
            }
        }
    }


//ax^2 + bx + c = 0;
//D = b^2 - 4*a*c;
//x1 = (-b + sqrt(D)) / (2a)
//x2 = (-b - sqrt(D)) / (2a)
//Пользователь вводит три числа: a, b и c. Решить представленное уравнение и выдать все ответы на него.