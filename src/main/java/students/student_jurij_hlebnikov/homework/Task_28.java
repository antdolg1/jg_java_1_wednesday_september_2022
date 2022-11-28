package students.student_jurij_hlebnikov.homework;

import java.util.Arrays;

public class Task_28 {
    public static void main(String[] args) {

        int arrayLength = (int) (Math.random() * 50 + 1);
        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 50);
        }

        System.out.println("Array Lang is: " + arrayLength);
        String allElements = Arrays.toString(array);
        System.out.println("Arrays numbers: " + allElements);

        Arrays.sort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));

        int minNum = Arrays.stream(array).min().getAsInt();

        System.out.println("Minimal number is: " + minNum);
    }
}
