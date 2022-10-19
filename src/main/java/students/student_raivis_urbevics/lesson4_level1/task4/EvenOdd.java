package students.student_raivis_urbevics.lesson4_level1.task4;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Input the any number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}





