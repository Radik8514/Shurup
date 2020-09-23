package Shurup;
import java.util.Scanner;
import java.util.Random;

public class Ugadaika {

    public static void main(String[] args) {
        Scanner sqw = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(100-1+1)+1;
        int c =0;
        System.out.println("Угадай число от 0 до 100");
        while(a>c){
            int b = sqw.nextInt();
            c++;
            if (a==b){
                System.out.println("Угадал " + "количество попыток = " + c);}
            else if(a > b){
                System.out.println("Мое число больше");}
            else {
                System.out.println("Мое число меньше");}

        }
    }
}
