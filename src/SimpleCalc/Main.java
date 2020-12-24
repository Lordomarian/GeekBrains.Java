package SimpleCalc;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ваша задача угадать число!");
            System.out.println("Введите верхную границу");
            int range = scanner.nextInt();
            int number = (int) (Math.random() * range);
            PlayLevel(range, number);
            System.out.println("Введите 1 чтобы сыграть еще");
            int again = scanner.nextInt();
            if (again != 1) {
                break;
            }
        }
        scanner.close();
    }
    private static void PlayLevel (int range, int number){
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали!");
                break;
            }else if (input_number > number){
                System.out.println("Загаданное число меньше");
            }else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
