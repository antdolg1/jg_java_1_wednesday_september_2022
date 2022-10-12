
package students.student_renat_galickij.lesson_2.level_1_inter;

import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        int addition, subtraction, multiplication;
        double  division;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first whole number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second whole number");
        int secondNumber = scanner.nextInt();

        addition = (firstNumber + secondNumber);
        subtraction = (firstNumber - secondNumber);
        multiplication = (firstNumber * secondNumber);
         division =  ((double) firstNumber / secondNumber);


        System.out.println("addition equals = " + addition);
        System.out.println("subtraction equals = " + subtraction);
        System.out.println("multiplication equals = " + multiplication);
        System.out.println("division equals = " + division);
    }
}