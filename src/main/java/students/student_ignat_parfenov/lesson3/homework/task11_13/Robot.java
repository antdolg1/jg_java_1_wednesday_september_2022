package students.student_ignat_parfenov.lesson3.homework.task11_13;

public class Robot {

    public void sayHello() {
        System.out.println("Hello!");
    }

    public Robot() {
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    String name;

    Robot(String robotName) {
        this.name = robotName;
    }
}
