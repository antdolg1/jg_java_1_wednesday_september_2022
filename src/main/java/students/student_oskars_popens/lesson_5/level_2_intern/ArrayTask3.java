package students.student_oskars_popens.lesson_5.level_2_intern;

//Напишите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//        - заполните каждую ячейку массива случайным числом,
//        - выведите значение каждой ячейки на консоль.

class ArrayTask3 {
    public static void main(String[] args) {
        int[] numbers = MyArrayUtils.getRandomIntArray(3);

        System.out.print("Array of random numbers:");
        MyArrayUtils.printArray(numbers);

    }
}
