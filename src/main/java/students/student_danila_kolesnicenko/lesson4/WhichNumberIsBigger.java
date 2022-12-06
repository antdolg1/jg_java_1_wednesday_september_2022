package students.student_danila_kolesnicenko.lesson4;

import java.util.Scanner;

class WhichNumberIsBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        System.out.println("Please enter your first number :");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter your second number :");
        secondNumber = scanner.nextInt();
        if (firstNumber > secondNumber){
            System.out.println(firstNumber);
        }
        else if (firstNumber < secondNumber){
            System.out.println(secondNumber);
        }
    }
}
