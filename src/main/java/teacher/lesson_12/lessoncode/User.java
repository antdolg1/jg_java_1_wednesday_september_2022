package teacher.lesson_12.lessoncode;

public class User {

    String name;
    String familyName;
    int age;
    boolean hasCriminalRecord;
    boolean isEuCitizen;

    public User(String name, String familyName, int age) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.isEuCitizen = true;
    }

    public void robABank() {
        System.out.println("User robbed a bank!");
        hasCriminalRecord = true;
    }

    public void loosePassport() {
        System.out.println("User lost his passport!");
        isEuCitizen = false;
    }

    public void validateUser() throws UserDeniedException {
        System.out.println("User validation process started!");
        if (!hasCriminalRecord && isEuCitizen) {
            System.out.println("User passed criminal record check and validation process.");
        } else {
            throw new UserDeniedException("User " + name + " " + familyName + " did not pass criminal record check or is no eu citizen");
        }
    }

}
