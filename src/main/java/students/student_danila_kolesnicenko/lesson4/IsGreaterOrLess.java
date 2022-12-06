package students.student_danila_kolesnicenko.lesson4;


import java.util.Scanner;

class IsGreaterOrLess {
    public static void main(String[] args) {

        int userNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        userNumber = scanner.nextInt();
        if (userNumber > 0) {
            System.out.println("Your number is positive");


        } else if (userNumber < 0) {
            System.out.println("Your number is negative");

        }
    }
}
