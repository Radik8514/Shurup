package Shurup;

import java.util.Scanner;

public class osi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите центр прямоугольника");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Введите размеры сторон прямоугольника");
        double w = scanner.nextDouble();//ширина
        double h = scanner.nextDouble();//Высота
        System.out.println("Введите точку с кординатами");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        w = w / 2;
        h = h / 2;
        if (x2<x1+w&&x2>x1-w&&y2<y1+h&&y2>y1-h){
            System.out.println("Внутри прямоугольника");}
        else if (y2<=y1+h&&y2>=y1-h&&x2==x1+w){
            System.out.println("На правой границы");}
        else if (y2<=y1+h&&y2>=y1-h&&x2==x1-w){
            System.out.println("На левой границы");}
        else if (y2==y1+h&&x2<=x1+w&&x2>=x1-w){
            System.out.println("На верхней границе");}
        else if (y2==y1-h&&x2<=x1+w&&x2>=x1-w){
            System.out.println("На нижней границе");}
        else {
            System.out.println("Снаружи прямоугольника");
        }
    }
}

