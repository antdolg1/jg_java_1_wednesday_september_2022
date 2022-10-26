package students.student_konstantin_karetnikov.lesson_3.level_3;

class Robot {
    void sayHello() {
        System.out.println("Hello!");
    }
    void sayYourName() {
        System.out.println("My name is " + name);
    }
    String name;
    Robot(String robotName) {

        this.name = robotName;
    }
}
