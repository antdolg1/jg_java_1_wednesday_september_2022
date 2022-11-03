package students.student_svetlana_seda.lesson_4.homework.level_2;

import java.util.Scanner;

class EqualsDifferent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two whole numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers " + number1 + " and " + number2 + " are equals!");

        } else {
            System.out.println("Numbers " + number1 + " and " + number2 + " are different!");
        }

    }

}
