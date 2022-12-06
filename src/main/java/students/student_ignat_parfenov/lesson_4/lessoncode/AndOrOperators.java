package students.student_ignat_parfenov.lesson_4.lessoncode;

import java.util.Scanner;

public class AndOrOperators {

    public static void main(String[] args) {

        System.out.print("Please input month number from 1 till 12: ");
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
        } else if (monthNumber >= 12 && monthNumber <= 24 || monthNumber <= 1) {
            System.out.println("Are you from this planet??");
        } else {
            System.out.println("ERROR ERROR ERROR");
            // вариант с ошибочным вводом текста вместо цифры не проходит, так как сканнер запрашивает именно число в стр.12//
        }

        System.out.println("Please input the number: ");
        int number = scanner.nextInt();

        if (number >0 && number != 0 && number < 5){
            System.out.println("Number is between 1 and 4");
        } else if (number == 10) {
            System.out.println("Number is 10");
        } else if (number < 0 && number > -5 || number > -4) {
            System.out.println("Number is between -1 and -4 or between -1 and -3.");
        }
    }
}
