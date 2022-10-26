package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        System.out.println("Please input number from 1 to 6");

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

//        if (level == 1) {
//            System.out.println("Intern");
//        } else if (level == 2) {
//            System.out.println("Junior");
//        } else if (level == 3) {
//            System.out.println("Middle");
//        } else if (level == 4) {
//            System.out.println("Senior");
//        } else if (level == 5) {
//            System.out.println("Architect");
//        } else if (level == 6) {
//            System.out.println("CTO");
//        } else {
//            System.out.println("Wrong input number");
//        }

        switch (level) {
            case 1:
            case 2:
                System.out.println("Junior");
                break;
            case 3:
                System.out.println("Middle");
                break;
            case 4:
                System.out.println("Senior");
                break;
            case 5:
                System.out.println("Architect");
                break;
            case 6:
                System.out.println("CTO");
                break;
            default:
                System.out.println("Please input required number!");
        }

        //enhanced version (since java 13)
        switch (level) {
            case 1, 2 -> System.out.println("Junior");
            case 3 -> System.out.println("Middle");
            case 4 -> System.out.println("Senior");
            case 5 -> System.out.println("Architect");
            case 6 -> System.out.println("CTO");
            default -> System.out.println("Please input required number!");
        }
    }
}


