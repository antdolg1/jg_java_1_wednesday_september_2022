package students.student_oskars_popens.lesson_4.level_2_intern;

import java.util.Scanner;

class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Please enter 1-st number:");
        number1 = sc.nextInt();
        System.out.println("Please enter 2-nd number:");
        number2 = sc.nextInt();

        if (number1 == number2)
        {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
