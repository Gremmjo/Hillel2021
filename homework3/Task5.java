package def.homework3;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int x = scanner.nextInt();
        System.out.println("Введите степень: ");
        int n = scanner.nextInt();

        // System.out.println(Math.pow(n,x));
        long result = x;


        for (int i = 1; i < n; i++) {
            result *= x;
        }


        System.out.println("Число " + x + " в степени " + n + " равно " + result);
    }
}
