package students.student_jurij_hlebnikov.homework;

import java.util.Scanner;

public class Task_26 {
    public static void main(String[] args){

        System.out.println("Введите длину массива: ");

        Scanner scanner = new Scanner(System.in);
        int arrayLang = scanner.nextInt();

        System.out.println("Элементы массива: ");

        int[] array = new int[arrayLang];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arrayLang; i++){
            System.out.print(" " + array[i]);
        }
    }
}
