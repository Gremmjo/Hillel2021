package def.homework3;

public class Task12 {

    public static void main(String[] args) {
        int array[] = {4, 8, 0, 6, -5};
        int sum = 0;
        double arifm;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        arifm = (double) sum / array.length;

        System.out.println("Среднее арифметическое ммассива равно : " + arifm);
    }
}
