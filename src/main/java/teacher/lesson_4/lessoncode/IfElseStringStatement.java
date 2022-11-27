package teacher.lesson_4.lessoncode;

public class IfElseStringStatement {

    public static void main(String[] args) {

        String dogName = "Bobik";

        if (dogName.equals("Sharik")) {
            System.out.println("Dog name is Sharik");
        } else if (dogName.equals("Zuza")) {
            System.out.println("Dog name is Zuza");
        } else if (dogName.equals("Ponchik")) {
            System.out.println("Dog name is Ponchik");
        } else if (dogName.equals("Bobik")) {
            System.out.println("Dog name is Bobik");
        } else {
            System.out.println("Dog name is unknown");
        }
    }
}
