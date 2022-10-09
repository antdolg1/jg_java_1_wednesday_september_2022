package students.student_vasilij_cherenkov;

import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;


        Scanner scannerOne = new Scanner(System.in);
        System.out.println("Введите первое число");
        firstNumber = scannerOne.nextInt();
        Scanner scannerTwo = new Scanner(System.in);
        System.out.println("Введите второе число");
        secondNumber = scannerTwo.nextInt();

        int sum= firstNumber + secondNumber;
        int sub= firstNumber - secondNumber;
        int mult= firstNumber * secondNumber;
        int div= firstNumber / secondNumber;

        System.out.println("Результат сложения  " + sum + "\nРезультат вычитания " + sub + "\nРезультат умножения " + mult + "\nРезультат деления   "+ div  );
    }
}