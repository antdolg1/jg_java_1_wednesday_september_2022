package students.student_vladislav_saksin.lesson_5.homework.level_2;

import java.util.Arrays;

class Task15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        int x = numbers[0] = (int) (Math.random() * 10);
        int y = numbers[1] = (int) (Math.random() * 10);
        int z = numbers[2] = (int) (Math.random() * 10);

        System.out.println("Random numbers are = " + Arrays.toString(numbers));

        System.out.println("Random numbers plus 2 are: " + (x + 2) + ", " + (y + 2) + ", " + (z + 2));


    }

}
