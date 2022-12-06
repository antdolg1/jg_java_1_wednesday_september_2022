package students.student_danila_kolesnicenko.lesson4;

import java.util.Scanner;

class NumberIsBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        System.out.println("Please enter your first number :");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number :");
        secondNumber = scanner.nextInt();
        System.out.println("Please enter your third number");
        thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber);
        }
        else if (secondNumber > firstNumber && secondNumber > thirdNumber){
            System.out.println(secondNumber);
        }
        else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
            System.out.println(thirdNumber);
        }
    }
}
