package students.student_oskars_popens.lesson_5.level_2_intern;

import java.util.Scanner;

//Напишите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//        - заполните каждую ячейку массива числом, запрошенным у пользователя,
//        - выведите значение каждой ячейки на консоль.

class ArrayTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Please enter value for number [%d]: ", i);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("You are entered following numbers:");
        MyArrayUtils.printArray(numbers);
    }
}
