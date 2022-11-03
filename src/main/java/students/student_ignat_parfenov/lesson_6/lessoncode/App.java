package students.student_ignat_parfenov.lesson_6.lessoncode;

class Thing {

    String name;
    static String description; // = "I am the thing"; или присвоить имя прямо в классе

    void showName() {
        System.out.println(name);
    }

    static void showDescription() {
        System.out.println(description);
    }
}

public class App {

    public static void main(String[] args) {

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing1.name = "Bobby";
        thing2.name = "Susan";

        thing1.showName();
        thing2.showName();

        Thing.description = "I am the thing"; // в случае присвоения имени прямо в классе, эта строка не нужна!
        Thing.showDescription();

    }
}