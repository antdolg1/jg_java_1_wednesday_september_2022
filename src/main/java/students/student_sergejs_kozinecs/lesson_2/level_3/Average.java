package students.student_sergejs_kozinecs.lesson_2.level_3;

import java.util.Scanner;

public class Average {

    public static double getAverage(int... args) {
        double sum = 0;

        for (int arg : args) {
            sum += arg;
        }
        
        return sum / args.length;
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        double average;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        num3 = scanner.nextInt();

        average = getAverage(num1, num2, num3);
        System.out.println("Your average number is: " + average);

        scanner.close();
    }
}
