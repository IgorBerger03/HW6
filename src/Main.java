import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        //Задание 1
        int sum = 0;
        for (int element: arr) {
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //Задание 2
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println("Максимальная сумма трат за день составила "+ max + " рублей.");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");

        //Задание 3
        double average = 0;
        if (arr.length > 0) {
            double s = 0;
            for (int a: arr) {
                sum = sum + a;
            }
            average = sum / arr.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        //Задание 4
        char [] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1;  i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}