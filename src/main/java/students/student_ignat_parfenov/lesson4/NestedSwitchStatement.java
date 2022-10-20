package students.student_ignat_parfenov.lesson4;

public class NestedSwitchStatement {

    public static void main(String[] args) {

        String course = "Soups";
        int position = 1;

        switch (course) {
            case "Soups":
                System.out.println("Please choose your soup: ");
                switch (position){
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
                        System.out.println("We have only 3 positions");
                }
        }

    }
}
