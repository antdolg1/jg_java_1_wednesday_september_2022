package students.student_raivis_urbevics.lesson5_level4.task25;

import java.util.Scanner;

  class LengthOfArray {

    public static void main(String[] args) {
        System.out.println("Please enter the length of array");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] numbers = new int[arrayLength];
        System.out.println("Please enter the first number");
        System.out.println("Please enter the  second number");
        System.out.println("Please enter the  third number");
        System.out.println("Please enter the fourth number");
        System.out.println("Please enter the  fifth number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        numbers[0] = num1;
        numbers[1] = num2;
        numbers[2] = num3;
        numbers[3] = num4;
        numbers[4] = num5;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}
