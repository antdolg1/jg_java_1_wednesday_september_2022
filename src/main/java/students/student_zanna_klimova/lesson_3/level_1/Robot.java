package students.student_zanna_klimova.lesson_3.level_1;

class Robot {
    String name;
    void sayHello() {
        System.out.println("Hello!");
    }

    Robot(String name) {
        this.name = name;
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

    Robot() {

    }
}
