package students.student_oskars_popens.lesson_5.level_2_intern;

//Написашите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//        - заполните каждую ячейку массива случайным числом,
//        - посчитайте сумму всех ячеек и распечатайте ее на консоль.

class ArrayTask4 {
    public static void main(String[] args) {
        int[] numbers = MyArrayUtils.getRandomIntArray(3);

        System.out.print("Array of random numbers:");
        MyArrayUtils.printArray(numbers);
        System.out.print("\nSum of array elements = " +
                MyArrayUtils.getSumOfArray(numbers));

//Напишите программу, в которой:
//    - создайте массив целых чисел длиной 3,
//    - заполните каждую ячейку массива случайным числом,
//    - посчитайте среднее значение и выведите его на консоль.

        System.out.print("\nAverage sum of array elements = " +
                MyArrayUtils.getAverage(numbers));

    }
}