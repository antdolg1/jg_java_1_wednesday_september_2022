package students.student_igor_budnitski.level3;

import java.util.Scanner;

/*
* Напишите программу, которая запрашивает у пользователя
три целых числа и выводит их среднее арифметическое
(складывает все числа и делит на их количество).
* */
public class Task11 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter First number: ");
        num1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        num2 = scanner.nextInt();
        System.out.print("Please enter third number: ");
        num3 = scanner.nextInt();
        System.out.println("Average will equal: " + (double)(num1 + num2 + num3)/3);
    }
}
