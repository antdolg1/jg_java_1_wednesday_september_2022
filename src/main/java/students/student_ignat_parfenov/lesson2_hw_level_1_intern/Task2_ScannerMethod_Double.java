package students.student_ignat_parfenov.lesson2_hw_level_1_intern;

import java.util.Scanner;

public class Task2_ScannerMethod_Double {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Imput the first number : ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Imput the second number : ");
        double secondNumber = scanner.nextDouble();
        System.out.println("Imput the third number : ");
        double thirdNumber = scanner.nextDouble();

        System.out.println("The addition result is : " + (firstNumber+secondNumber+thirdNumber));
        System.out.println("The subtraction result is : " +(firstNumber-secondNumber-thirdNumber));
        System.out.println("The multiplication result is : " + firstNumber*secondNumber*thirdNumber);
        System.out.println("The division result is : " + firstNumber/secondNumber/thirdNumber);

    }

}
