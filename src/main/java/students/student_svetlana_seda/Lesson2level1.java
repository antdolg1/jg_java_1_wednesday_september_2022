package students.student_svetlana_seda;

import java.util.Scanner;

public class Lesson2level1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number:");
        int firstNumber=scanner.nextInt();
        System.out.println("Input the second number");
        int secondNumber=scanner.nextInt();
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber / secondNumber);
        System.out.println(firstNumber * secondNumber);
    }
}