package students.student_jurij_hlebnikov.homework;

import java.util.Arrays;

public class Task_27 {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 100 + 1);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);

        }
        System.out.println("Array Lang is: " + n);
        String allElements = Arrays.toString(array);
        System.out.println("Array numbers: " + allElements);

        Arrays.sort(array);

        System.out.println("Array after sorting: " + Arrays.toString(array));

        int maxNum = array[array.length - 1];
        System.out.println("Maximum number: " + maxNum);
    }
}

