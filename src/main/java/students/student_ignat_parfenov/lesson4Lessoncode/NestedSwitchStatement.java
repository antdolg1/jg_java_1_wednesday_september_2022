package students.student_ignat_parfenov.lesson4Lessoncode;

import java.util.Scanner;

public class NestedSwitchStatement {

    public static void main(String[] args) {

        System.out.println("Please choose your course. Available courses: Soups or Main dish or Dessert. ");

        Scanner scanner = new Scanner(System.in);
        String course = scanner.next();

 //       int position;

        switch (course) {
            case "Soups":
                System.out.println("Please choose your soup: 1 - Mashroom soup, 2 - Borsch, 3 - Onion soup.");
                int position1 = scanner.nextInt();
                switch (position1) {
                    case 1 -> System.out.println("Mashroom soup");
                    case 2 -> System.out.println("Borsch");
                    case 3 -> System.out.println("Onion soup");
                    default -> System.out.println("We have only 3 positions");
                }
                break;

            case "Main":
                System.out.println("Please choose your main dish: 1 - Kartoshka s kuroj, 2 - Blini, 3 - Grecha s sosiskoi.");
                int position2 = scanner.nextInt();
                switch (position2) {
                    case 1 -> System.out.println("Kartoshka s kuroj");
                    case 2 -> System.out.println("Blini");
                    case 3 -> System.out.println("Grecha s sosiskoi");
                    default -> System.out.println("We have only 3 positions");
                }
                break;

            case "Dessert":
                System.out.println("Please choose your dessert: 1 - Ice cream, 2 - Banana fudge, 3 - Cheese cake.");
                int position3 = scanner.nextInt();
                switch (position3) {
                    case 1 -> System.out.println("Ice cream");
                    case 2 -> System.out.println("Banana fudge");
                    case 3 -> System.out.println("Cheese cake");
                    default -> System.out.println("We have only 3 positions");
                }
                break;

            default:
                System.out.println("We don't have such a course");
        }
    }
}
