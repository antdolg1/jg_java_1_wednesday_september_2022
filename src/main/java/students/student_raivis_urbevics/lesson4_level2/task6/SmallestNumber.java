package students.student_raivis_urbevics.lesson4_level2.task6;

import java.util.Scanner;

class SmallestNumber {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 < number2) {
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
