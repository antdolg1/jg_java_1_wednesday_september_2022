package students.student_konstantin_karetnikov;
import java.util.Scanner;

public class AveArithm {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double thirdNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        secondNumber = scanner.nextInt();
        System.out.println("Please enter third number: ");
        thirdNumber = scanner.nextInt();



        System.out.println("Answer is = " + ((firstNumber + secondNumber + thirdNumber) / 3));




    }

    }
