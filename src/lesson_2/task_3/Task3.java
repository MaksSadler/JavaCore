package lesson_2.task_3;

import java.util.Arrays;

public class Task3 {
    //Реализация сортировки подсчетом.

    public static int[] countSort(int[] inputArray) {
        int N = inputArray.length;
        int M = 0;

        for (int j : inputArray) {
            M = Math.max(M, j);
        }

        int[] countArray = new int[M + 1];

        for (int j : inputArray) {
            countArray[j]++;
        }

        for (int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            outputArray[countArray[inputArray[i]] - 1] = inputArray[i];
            countArray[inputArray[i]]--;
        }
        return outputArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 10, 1, 2, 5, 4, 9, 6, 20};
        int[] sorted = countSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sorted));
    }
}
