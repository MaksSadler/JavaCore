package lesson_2.task_1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //Если нам необходима точность вычисления, то толькло BigDecimal!!!
        //BigInteger только для целых чисел, а бигдецимал универсальный метод.
        BigDecimal a = BigDecimal.valueOf(9999999);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number: ");
        BigDecimal b = sc.nextBigDecimal();

        System.out.println(b.multiply(a));
    }
}
