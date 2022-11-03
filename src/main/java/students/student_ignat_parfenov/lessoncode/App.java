package students.student_ignat_parfenov.lessoncode;

class Thing {

    String name;
    static String description;

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

        Thing.description = "I am the thing";
        Thing.showDescription();

    }
}