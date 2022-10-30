package students.student_vladislav_saksin;

public class Robot {

    String name;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is ROBO");
    }

    public Robot(String robotName) {
        this.name = robotName;

    }
    void sayName () {
        System.out.println("My name is " + this.name);
    }

    public Robot() {

    }
}
