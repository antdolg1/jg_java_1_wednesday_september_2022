package students.student_ignat_parfenov.lesson_2_hw_level_3_junior;

import java.util.Scanner;

public class Task11_ArithmeticMean {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your first numbers : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter your second number : ");
        int num2 = scanner.nextInt();

        System.out.print("Enter your third number : ");
        int num3 = scanner.nextInt();

        double[] nums = new double[]{num1, num2, num3};

    for (double m : nums) {

    }

    System.out.println("Arithmetic mean is = " + (num1+num2+num3)/ nums.length);
}
}
