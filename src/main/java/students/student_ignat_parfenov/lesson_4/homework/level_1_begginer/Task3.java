package students.student_ignat_parfenov.lesson_4.homework.level_1_begginer;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Please enter any number from 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();

//        if (number2 == 1){
//            System.out.println("Monday");
//        } else if (number2 == 2) {
//            System.out.println("Tuesday");
//        } else if (number2 == 3) {
//            System.out.println("Wednesday");
//        } else if (number2 == 4) {
//            System.out.println("Thursday");
//        } else if (number2 == 5) {
//            System.out.println("Friday");
//        } else if (number2 == 6) {
//            System.out.println("Saturday");
//        } else if (number2 == 7) {
//            System.out.println("Sunday");
//        } else{
//            System.out.println("Please enter requested number! from 1 till 7!!");
//        }

        switch (number2) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Are you serious?! Please enter requested! number from 1 till 7!!");
        }
    }
}
