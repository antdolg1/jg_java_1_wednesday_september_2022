package students.student_jurij_hlebnikov.homework;

import java.util.Scanner;

public class Task_25 {

        public static void main(String[] args){

            System.out.println("Введите длину одномерного массива:");

            Scanner keyScanner = new Scanner(System.in);

            int arrayLang = keyScanner.nextInt();

            System.out.println("Введите элементы массива:");

            int[] array = new int[arrayLang];

            for (int i = 0; i < arrayLang; i ++){
                array[i] = keyScanner.nextInt();
            }

            System.out.println("Введенные элементы массива:");
            for (int i = 0; i < arrayLang; i++){
                System.out.println(" " + array[i]);
            }
    }
}
