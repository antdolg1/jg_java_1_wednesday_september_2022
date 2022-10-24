package students.student_danila_kolesnicenko.lesson4;

import java.util.Scanner;

class EvenOrOdd {
    public static void main(String[] args) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        userNumber = scanner.nextInt();
        if (userNumber % 2 == 0) {

            System.out.println("Your number is even");

        } else if (userNumber % 2 != 0) {

            System.out.println("Your number is odd");
        }
    }
}
