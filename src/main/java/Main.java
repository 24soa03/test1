import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = sc.nextInt();
        System.out.println("Введите второе число ");
        int b = sc.nextInt();
        System.out.println("Введите операцию ");
        char d = sc.next().charAt(0);


        /* String[] itemBuild = {"Линза", "Урна", "Блинк", "Аганим", "Глимер"};
        System.out.println(itemBuild[0]); */

        if (d == '+') {
            System.out.println("Ваше значение: " + (a + b));
        } else if (d == '-') {
            System.out.println("Ваше значение: " + (a - b));
        } else if (d == '*') {
            System.out.println("Ваше значение: " + (a * b));
        } else if (d == '/') {
            System.out.println("Ваше значение: " + (a / b));
        }

    }
}