package lesson_2.task_2;

import java.util.Arrays;

class Task2 {
    //Это Реализация добавления елемента по индексу и просто добавления елемента через System.arraycopy.

    public static int[] arrayAddElement(int value, int[] arr) {
        return arrayAddElement(value, arr.length, arr);
    }

    public static int[] arrayAddElement(int value, int index, int[] arr) {
        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException("Произошел выход за пределы массива.");
        }
        int[] result = new int[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, index);
        result[index] = value;
        System.arraycopy(arr, index, result, index + 1, arr.length - index);
        return result;
    }
// Это стандартный метод реализации добавления эелемента по индексу.
//    public static int[] arrayAddPosition(int value, int index, int[] arr2) {
//        int[] tmpArr = new int[arr2.length + 1];
//        int a = 0;
//        for (int i = 0; i < tmpArr.length; i++) {
//            if (i == index) {
//                tmpArr[i] = value;
//            } else {
//                tmpArr[i] = arr2[a];
//                a++;
//            }
//        }
//        return tmpArr;
//    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 10;
        int[] resultArr = arrayAddElement(num, arr);
        System.out.println(Arrays.toString(resultArr));

        int[] arr2 = {1, 2, 3, 4};
        int num2 = 7;
        int[] resultArr2 = arrayAddElement(num2, 1, arr2);
        System.out.println();
        System.out.println(Arrays.toString(resultArr2));
    }
}
