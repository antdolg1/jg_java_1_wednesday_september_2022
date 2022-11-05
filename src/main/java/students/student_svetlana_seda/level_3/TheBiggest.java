package students.student_svetlana_seda.level_3;

import java.util.Scanner;

class TheBiggest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        int number3 = scanner.nextInt();
        //1>2>3
        //2>1>3
        //3>1>2
        if ((number1 > number2) && (number1 > number3)) {
            System.out.println("The biggest number is " + number1 + ".");
        } else if ((number2 > number1) && (number2 > number3)) {
            System.out.println("The biggest number is " + number2 + ".");
        } else if ((number3 > number1) && (number3 > number2)) {
            System.out.println("The biggest number is " + number3 + ".");
        }

    }

}
