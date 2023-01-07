package students.student_oskars_popens.lesson_5.level_4_junior;

import students.student_oskars_popens.lesson_5.level_2_intern.MyArrayUtils;

import java.util.Scanner;

class ArrayTask25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter length of array: ");
        int arrayLen = scanner.nextInt();
        int[] numbers = new int[arrayLen];

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Please enter %d. element of array: ", i+1);
            numbers[i] = scanner.nextInt();
         }

        System.out.printf("Your array have %d element(s)\n", numbers.length);
        System.out.print("You entered following numbers: ");
        MyArrayUtils.printArray(numbers);
    }
}
