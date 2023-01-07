package students.student_oskars_popens.lesson_5.level_4_junior;

import students.student_oskars_popens.lesson_5.level_2_intern.MyArrayUtils;
import java.util.Scanner;

class ArrayTask26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter length of array: ");
        int arrayLen = scanner.nextInt();
        int[] numbers = MyArrayUtils.getRandomIntArray(arrayLen);

        System.out.printf("Your array have %d element(s)\n", numbers.length);
        System.out.print("Array have following numbers: ");
        MyArrayUtils.printArray(numbers);
    }
}
