package students.student_ignat_parfenov.lesson_4.lessoncode;

import java.util.Scanner;

public class AndOrOperators {

    public static void main(String[] args) {

        System.out.print("Please input month number: ");
        Scanner scanner = new Scanner(System.in);

        int monthNumber = scanner.nextInt();

        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("WINTER");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("SPRING");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("SUMMER");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("AUTUMN");
        }
    }
}
