package def.homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        for (int i = 1 ; i <= 10; i++) {
            System.out.print(num * i + " ");
        }
    }
}
