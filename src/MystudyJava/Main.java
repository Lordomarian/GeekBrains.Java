package MystudyJava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* System.out.println("Hello world");
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a = " + a);
        */
        int result ;
        loop:
        while (true) {
            System.out.println("Введите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");
            Scanner scanner = new Scanner(System.in);
            int operation = scanner.nextInt();
            if (operation < 1 | operation > 4){
                System.out.println("Неверный номер операции");
                continue loop;
            }
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число");
            int b = scanner.nextInt();
            if (operation == 1) {
                result = a + b;
            } else if (operation == 2) {
                result = a - b;
            } else if (operation == 3) {
                result = a * b;
            } else  {
                result = a / b;
            }
            break;
        }
        System.out.println("Результат = " + result);
    }
}
