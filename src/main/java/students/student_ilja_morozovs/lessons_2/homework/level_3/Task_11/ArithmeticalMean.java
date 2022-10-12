package students.student_ilja_morozovs.lessons_2.homework.level_3.Task_11;

import java.util.Scanner;

public class ArithmeticalMean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne;
        int numberTwo;
        int numberThree;
        double result;
        System.out.println("Enter number one: ");
        numberOne = scanner.nextInt();
        System.out.println("Enter number two: ");
        numberTwo = scanner.nextInt();
        System.out.println("Enter number three: ");
        numberThree = scanner.nextInt();
        result = (numberOne + numberTwo + numberThree) / 3;
        System.out.println("Arithmetical mean is: " + result);
    }
}

