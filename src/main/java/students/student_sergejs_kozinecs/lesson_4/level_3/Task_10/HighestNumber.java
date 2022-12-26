package students.student_sergejs_kozinecs.lesson_4.level_3.Task_10;

import java.util.Scanner;

class HighestNumber {
    static int isHighest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }

    static int isHighest2(int num1, int num2, int num3) {
        int highestNumber = num1;

        if (num2 > highestNumber) {
            highestNumber = num2;
        }

        if (num3 > highestNumber) {
            highestNumber = num3;
        }

        return highestNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Personally prefer second version :3 

        System.out.println(isHighest(num1, num2, num3));
        System.out.println(isHighest2(num1, num2, num3));

        scanner.close();
    }
}
