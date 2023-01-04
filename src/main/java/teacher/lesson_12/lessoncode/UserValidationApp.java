package teacher.lesson_12.lessoncode;

public class UserValidationApp {

    public static void main(String[] args) {

        User user = new User("John", "Doe", 23);

        user.robABank();

        try {
            user.validateUser();
        } catch (UserDeniedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("User status:" + "\r\n Has criminal record: " + user.hasCriminalRecord + "\r\n Is EU citizen: " + user.isEuCitizen);
        }

    }
}
