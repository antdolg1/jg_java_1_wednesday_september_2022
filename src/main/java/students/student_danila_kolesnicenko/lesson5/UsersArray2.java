package students.student_danila_kolesnicenko.lesson5;

import java.util.Scanner;

class UsersArray2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random()*55);
        }
        for (int i = 0; i < size; i++) {
            System.out.println(" " + array[i]);
        }
    }
}

