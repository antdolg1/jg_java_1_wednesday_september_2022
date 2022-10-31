package students.student_zanna_klimova.lesson_3.level_1;

public class Robot {
    String name;
    public void sayHello() {
        System.out.println("Hello!");
    }

    Robot(String name) {
        this.name = name;
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    public Robot() {

    }
}
