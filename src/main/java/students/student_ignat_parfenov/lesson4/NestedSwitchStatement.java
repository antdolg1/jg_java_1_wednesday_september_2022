package students.student_ignat_parfenov.lesson4;

import java.util.Scanner;

public class NestedSwitchStatement {

    public static void main(String[] args) {

        System.out.println("Please choose your course. Available courses: Soups or Main dish or Dessert. ");
        Scanner scanner = new Scanner(System.in);
        String course = scanner.next();

        int position;

        switch (course) {
            case "Soups":
                System.out.println("Please choose your soup: ");
                position = scanner.nextInt();
                switch (position) {
                    case 1 -> System.out.println("Mashroom soup");
                    case 2 -> System.out.println("Borsch");
                    case 3 -> System.out.println("Onion soup");
                    default -> System.out.println("We have only 3 positions");
                }
                break;

            case "Main":
                System.out.println("Please choose your main dish: ");
                position = scanner.nextInt();
                switch (position) {
                    case 1:
                        System.out.println("Kartoshka s kuroj");
                        break;
                    case 2:
                        System.out.println("Blini");
                        break;
                    case 3:
                        System.out.println("Grecha s sosiskoi");
                        break;
                    default:
                        System.out.println("We have only 3 positions");
                }
                break;

            case "Dessert":
                System.out.println("Please choose your dessert: ");
                position = scanner.nextInt();
                switch (position) {
                    case 1:
                        System.out.println("Ice cream");
                        break;
                    case 2:
                        System.out.println("Banana fudge");
                        break;
                    case 3:
                        System.out.println("Cheese cake");
                        break;
                    default:
                        System.out.println("We have only 3 positions");
                }
                break;

            default:
                System.out.println("We don't have such a course");
        }
    }
}
