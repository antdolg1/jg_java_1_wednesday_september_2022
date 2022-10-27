package students.student_konstantin_karetnikov.lesson_4.level_1;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {

    System.out.print("Please enter your number: ");
    Scanner scanner = new Scanner (System.in);
    int number = scanner.nextInt();

    if (number%2==0){
        System.out.println("Even");
    }
    else {
        System.out.println("Odd");
    }
}
}
