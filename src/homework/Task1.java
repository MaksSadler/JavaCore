package homework;

import java.util.Arrays;

public class Task1 {

    static int countEvens(int[] arr) {
        int n = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                n++;
            }
        }
        return n;
    }

    static int diffEvens(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        return max - min;
    }

    static boolean checkEvens(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 10, 1, 2, 5, 4, 9, 6, 20, 0, 8, 1, 1, 1, 1, 10};

        System.out.println(Arrays.toString(arr));
        System.out.println("Количество четных эелеметов в массиве: " + countEvens(arr));
        System.out.println("Разница максимального и минимального значения массива: " + diffEvens(arr));
        System.out.println(checkEvens(arr));
    }
}
