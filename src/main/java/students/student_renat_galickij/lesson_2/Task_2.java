package students.student_renat_galickij.lesson_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        double addition, subtraction, multiplication, division;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first real number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second real number");
        double secondNumber = scanner.nextDouble();

        addition = (firstNumber + secondNumber);
        subtraction = (firstNumber - secondNumber);
        multiplication = (firstNumber * secondNumber);
        division =  ( firstNumber / secondNumber);


        System.out.println("addition equals = " + addition);
        System.out.println("subtraction equals = " + subtraction);
        System.out.println("multiplication equals = " + multiplication);
        System.out.println("division equals = " + division);
    }
}