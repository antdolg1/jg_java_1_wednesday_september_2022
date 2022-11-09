package students.student_zanna_klimova.lesson_3.level_1;

class RobotDemo {
     static void main(String[] args) {
        Robot robot = new Robot("Rider");
        Robot robot1 = new Robot("John");
        Robot robot2 = new Robot("Sam");

        robot.sayHello();
        robot.sayYourName();
        System.out.println("___________________________");

        robot1.sayHello();
        robot1.sayYourName();
        System.out.println("___________________________");

        robot2.sayHello();
        robot2.sayYourName();
    }
}
