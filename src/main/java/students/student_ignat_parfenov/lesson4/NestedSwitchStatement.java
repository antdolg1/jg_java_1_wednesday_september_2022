package students.student_ignat_parfenov.lesson4;

import java.util.Scanner;

public class NestedSwitchStatement {

    public static void main(String[] args) {

        System.out.println("Please choose the course. Available courses: Soups or Main or Desserts");
        Scanner scanner = new Scanner(System.in);

        String course = scanner.next();
        int position = 3;

        switch (course) {

            case "Soups":
                System.out.println("Please choice your soup");

                switch (position) {
                    case 1:
                        System.out.println("Mashroom soup");
                        break;

                    case 2:
                        System.out.println("Borsch");
                        break;

                    case 3:
                        System.out.println("Onion soup");
                        break;

                    default:
                        System.out.println("We have only three positions");
                }
                break;

            case 1:
                System.out.println("Kartoshka s kuroj");
                break;

            case 2:
                System.out.println("Blini");
                break;

            case 3:
                System.out.println("Grecha s sosiskoj");
                break;

            default:
                System.out.println("We have only three positions");

        }

    }
}
