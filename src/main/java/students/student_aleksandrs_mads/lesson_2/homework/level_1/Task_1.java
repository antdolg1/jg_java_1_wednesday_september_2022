package students.student_aleksandrs_mads.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int firstNumber=scanner.nextInt();
        System.out.println(firstNumber);
        int secondNumber= scanner.nextInt();
        System.out.println(secondNumber);
        int summ = firstNumber+secondNumber;
        int subtraction=firstNumber-secondNumber;
        int multiplication=firstNumber*secondNumber;
        int division=firstNumber/secondNumber;
        System.out.println(summ);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

    }
}
