package def.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов в массиве :");
        int n = scanner.nextInt();
        int[] randArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = (random.nextInt(65536) - 32768) / 1000;
        }

        System.out.println(Arrays.toString(randArray));

        int min = Integer.MAX_VALUE;
        for (int x : randArray) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Min = " + min);

    }
}
