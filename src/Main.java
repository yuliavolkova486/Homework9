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
        // Задание 1
        System.out.println("Задание 1");
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задание 2
        System.out.println("Задание 2");
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");


        // Задание 3
        System.out.println("Задание 3");
        System.out.println("Средняя сумма трат за месяц составила " + ((double) sum / arr.length) + " рублей");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
