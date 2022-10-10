package students.student_ilya_tihonov;

import java.util.Scanner;

public class ScannerNextDouble {

    public static void main(String[] args) {

        double a , b , sum , sum1 , sum2 , sum3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter eny numbers: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("______________");
        sum = a + b;
        sum1 = a - b;
        sum2 = a * b;
        sum3 = a / b;
        System.out.println("Addition- " + sum);
        System.out.println("Subtraction- " + sum1);
        System.out.println("Multiplication- " + sum2);
        System.out.println("Division- " + sum3);



    }

}
