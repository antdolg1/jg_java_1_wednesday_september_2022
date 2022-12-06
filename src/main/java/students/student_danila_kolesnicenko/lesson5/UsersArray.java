package students.student_danila_kolesnicenko.lesson5;

import java.util.Scanner;

class UsersArray {
    public static void main(String[] args) {
        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[]array = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++){
            System.out.println(" " + array[i]);
        }
    }
}
