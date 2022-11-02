package students.student_aleksandrs_mads.lesson_3.homework.level_3.Task_13;

class Robot {

    void sayHello() {
        System.out.println("Hello!");
    }

    String name;

    Robot(String robotName) {
        this.name = robotName;
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }
}
