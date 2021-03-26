package def.homework3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Получаем нечётные числа в диапазоне от 1 до 99");
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("-------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для получения его факториала:");
        int num = scanner.nextInt();
        long fact = 1;

        int j = 1;
        while (j <= num) {
            fact *= j;
            j++;
        }
        System.out.println("Факториал числа " + num + " равен " + fact);
    }
}

