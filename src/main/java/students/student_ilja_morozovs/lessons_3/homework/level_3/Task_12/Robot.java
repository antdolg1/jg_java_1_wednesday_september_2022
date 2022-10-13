package students.student_ilja_morozovs.lessons_3.homework.level_3.Task_12;

public class Robot {
    String roboName;

    public Robot(String roboName) {
        this.roboName = roboName;
    }

    public void sayYourName() {
        System.out.println("My name is: " + roboName + "!");
    }

    public void sayHello() {
        System.out.println("Hello im: " + roboName + "!");
    }
}
