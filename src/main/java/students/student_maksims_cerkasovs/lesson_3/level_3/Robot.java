package students.student_maksims_cerkasovs.lesson_3.level_3;

public class Robot {

    String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello, all!");// тут напишите команду распечатки на консоли строки "Hello!"
    }

    public Robot() {

    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
