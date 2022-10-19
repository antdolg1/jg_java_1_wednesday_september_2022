package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class AndOrOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter month number from 1 to 12:");
//        int monthNumber = scanner.nextInt();
//
//        if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
//            System.out.println("WINTER");
//        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
//            System.out.println("SPRING");
//        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
//            System.out.println("SUMMER");
//        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
//            System.out.println("AUTUMN");
//        } else if (monthNumber > 12 || monthNumber < 1){
//            System.out.println("Are you from this planet?");
//        } else {
//            System.out.println("ERROR ERROR ERROR!");
//        }

        System.out.println("Please enter number:");
        int number = scanner.nextInt();

        if (number > 5) {
            System.out.println("Number is between 5 and infinity");
        } else if (number == 10) {
            System.out.println("Number is 10");
        } else if ((number < 0 && number > -5) || number > -3) {
            System.out.println("Number is between -1 and -4 or between -1 and -2");
        }

        if (number == 10) {
            System.out.println("Number = 10");
        }

    }
}
