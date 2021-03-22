package def.homework2.task2;

public class Task2 {
    public static void main(String[] args) {
        double sum = 0;
        double arifm;

        for (String s : args){
            sum += Double.valueOf(s);
        }
        arifm = sum / args.length;
        System.out.printf("%6.3f",arifm);

    }
    }

