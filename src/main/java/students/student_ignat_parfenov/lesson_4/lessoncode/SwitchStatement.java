package students.student_ignat_parfenov.lesson_4.lessoncode;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        System.out.println("Enter you level number: ");
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
//        } else if (level == 6){
//            System.out.println("CTO");
//        } else {
//            System.out.println("Input the correct number");
//        }
//    }

        switch (level) {
            case 1:
                System.out.println("Intern");
                break;
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
                System.out.println("Input the correct number");
        }
    }
}



