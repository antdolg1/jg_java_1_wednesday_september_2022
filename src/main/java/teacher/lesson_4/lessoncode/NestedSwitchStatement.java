package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class NestedSwitchStatement {

    public static void main(String[] args) {


        System.out.println("Please choose course. Available courses: Soups or Main or Dessert");

        Scanner scanner = new Scanner(System.in);
        String course = scanner.next();

        switch (course) {
            case "Soups":
                System.out.println("Please choose your soup number. 1 - Mushroom soup, 2 - Borsch, 3 - Onion soup");
                int position = scanner.nextInt();
                switch (position) {
                    case 1:
                        System.out.println("Mushroom soup");
                        break;
                    case 2:
                        System.out.println("Borsch");
                        break;
                    case 3:
                        System.out.println("Onion soup");
                        break;
                    default:
                        System.out.println("We have only 3 positions");
                }
                break;
            case "Main":
                System.out.println("Please choose main dish");
                int position2 = scanner.nextInt();
                switch (position2) {
                    case 1:
                        System.out.println("Kartoshka s kuroj");
                        break;
                    case 2:
                        System.out.println("Blini");
                        break;
                    case 3:
                        System.out.println("Grecha s sosisoj");
                        break;
                    default:
                        System.out.println("We have only 3 positions");
                }
                break;
            case "Dessert":
                System.out.println("Please choose dessert");
                int position3 = scanner.nextInt();
                switch (position3) {
                    case 1:
                        System.out.println("Ice cream");
                        break;
                    case 2:
                        System.out.println("Banana fudge");
                        break;
                    case 3:
                        System.out.println("Cake");
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
