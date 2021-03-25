package def.homework2.task1;

public class Task1 {

    public static void main(String[] args) {
        double sum = 0;
        double arifm;

        for (String s : args){
            sum += Double.valueOf(s);
        }
        arifm = sum / 2;
        System.out.printf("%6.3f",arifm);


    }
}
