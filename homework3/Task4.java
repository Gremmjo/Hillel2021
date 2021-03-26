package def.homework3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Получаем нечётные числа в диапазоне от 1 до 99");
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        while (i < 100);

        System.out.println();
        System.out.println("-------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для получения его факториала:");
        int num = scanner.nextInt();
        int j = 1;
        long fact = 1;

        do {
            fact *= j;
            j++;
        }
        while (j <= num);


        System.out.println("Факториал числа " + num + " равен " + fact);

    }
}

