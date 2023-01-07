package students.student_oskars_popens.lesson_5.level_4_junior;

import students.student_oskars_popens.lesson_5.level_2_intern.MyArrayUtils;

class ArrayTask30 {
    public static void main(String[] args) {
        int arrayLen = 25;
        int[] numbers = MyArrayUtils.getRandomIntArray(arrayLen);

        System.out.print("Array elements: ");
        MyArrayUtils.printArray(numbers);
        System.out.print("\nOdd numbers in array:");
        MyArrayUtils.printOddNumbers(numbers);

    }
}
