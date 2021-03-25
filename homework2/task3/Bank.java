package def.homework2.task3;


import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму денежного вклада в грн :");
        double amount = scanner.nextDouble();

        System.out.println("Введите процент годовых :");
        int percent = scanner.nextInt();
        System.out.println("Введите временной промежуток вклада в годах :");
        int years = scanner.nextInt();


        double balance = amount;



        for (int i = 1; i <= years; i++) {
            for (int j = 1; j <= 12; j++) {
                double increase = balance *  12 / percent / 100;
                balance = balance + increase;
                System.out.printf("Прибавка за месяц %6.3f\n", increase);
            }

            System.out.print("Сумма на счету в конце " + i + " го года составляет ");
            System.out.printf("%6.3f\n", balance);
            System.out.println();


        }

        }
    }

