package students.student_artjoms_trosihins.lesson_4.level_3.task_8;

import java.util.Scanner;

class EqualOrDifferentNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;

        System.out.println("Please, enter first number: ");
        numberOne = scan.nextInt();

        System.out.println("Please, enter second number: ");
        numberTwo = scan.nextInt();

        System.out.println("Please, enter third number: ");
        numberThree = scan.nextInt();

        if (numberOne == numberTwo && numberTwo == numberThree) {
            System.out.print("All numbers are equal");
        } else if (numberOne != numberTwo && numberTwo != numberThree) {
            System.out.print("All numbers are different");
        } else {
            System.out.print("Neither all are equal or different");
        }
    }
}
