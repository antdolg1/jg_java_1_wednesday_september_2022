package students.student_raivis_urbevics.lesson4_level2.task5;


import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println("Input the first number");
        System.out.println("Input the second number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1);
        } else if (number2 > number1) {
            System.out.println(number2);
        }
    }
}



