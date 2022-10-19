package students.student_vladislav_saksin;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        double firstNumber;
        double secondNumber;
        double thirdNumber;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number:");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter second number");
        secondNumber = scanner.nextInt();
        System.out.println("Please enter third number");
        thirdNumber = scanner.nextInt();

        System.out.println((firstNumber + secondNumber + thirdNumber) / 3);


    }


}