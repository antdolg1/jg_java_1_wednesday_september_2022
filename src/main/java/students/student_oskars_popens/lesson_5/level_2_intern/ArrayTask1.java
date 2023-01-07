package students.student_oskars_popens.lesson_5.level_2_intern;

//Напишите программу, в которой:
//        - создайте массив целых чисел длиной 3,
//        - заполните каждую ячейку массива любым целым числом,
//        - выведите значение каждой ячейки на консоль.

class ArrayTask1 {
    public static void main(String[] args) {
        int[] intArray = {22, 54, 12};

        System.out.print("Array elements:");
        MyArrayUtils.printArray(intArray);
    }
}
