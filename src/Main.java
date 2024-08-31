public class Main {
    public static void main(String[] args) {
//        task1
        int arr[] = {15_000, 20_000, 40_000, 75_000, 2_000};
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
        //        task2
        int min = arr[0];
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        //        task3
        double average = 0;
        int j = 0;
        for (; j < arr.length; j++) {
          average += arr[j];
        }
        average = average/j;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        //        task3
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i -1];
            reverseFullName[reverseFullName.length - i - 1] = a;
        }
            for (char c : reverseFullName) {
                System.out.print(c);
            }

    }
}