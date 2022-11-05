package students.student_svetlana_seda.level_3;

import java.util.Scanner;

class IncreasingDecreasing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Insert the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Insert the third number: ");
        int number3 = scanner.nextInt();

        if ((number1 < number2) && (number2 < number3)) {
            System.out.println("Increasing numbers!");
        } else if ((number1 > number2) && (number2 > number3)) {
            System.out.println("Decreasing numbers!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }

    }

}
