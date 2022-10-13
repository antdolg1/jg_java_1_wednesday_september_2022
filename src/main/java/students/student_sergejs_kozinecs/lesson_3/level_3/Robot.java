package students.student_sergejs_kozinecs.lesson_3.level_3;

public class Robot {

    String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}