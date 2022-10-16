package students.student_jurij_hlebnikov.lesson_3.homework;

public class RobotDemo {
    public static void main(String[] args) {
        Robot boris = new Robot("kiborg ubijca");
        boris.sayHello();
        boris.sayYourName();

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();

    }
}
