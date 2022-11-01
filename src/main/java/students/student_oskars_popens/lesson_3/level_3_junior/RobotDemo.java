package students.student_oskars_popens.lesson_3.level_3_junior;

class RobotDemo {
    public static void main(String[] args) {
        Robot robo1 = new Robot("Killer");
        Robot robo2 = new Robot("Counter Rob");

        robo1.sayHello();
        robo1.sayYourName();
        robo1.repeatYourName();

        robo2.sayHello();
        robo2.sayYourName();
        robo2.repeatYourName();
    }
}
