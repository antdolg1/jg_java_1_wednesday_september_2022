package students.student_igor_budnitski.lesson_3.homework.level_1;

public class Robot {

    String name;
    public void sayHello() {
        // тут напишите команду распечатки на консоли строки "Hello!"
        System.out.println("Hello!");
    }

    public void sayYourName() {
        // тут напишите команду распечатки на консоли строки "My name is ROBO"
        System.out.println("My name is " + this.name);
    }

    public Robot() {

    }

    public Robot(String robotName){
        this.name = robotName;
    }
}
