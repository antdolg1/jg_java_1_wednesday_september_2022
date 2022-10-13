package students.student_igor_budnitski.lesson_3.homework.level_1;

public class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Fox"); // creating robot object
        robot1.sayHello(); // calling method to say Hello
        robot1.sayYourName(); // calling method to print name

        Robot robot2 = new Robot("Rex");
        robot2.sayHello();
        robot2.sayYourName();

        Robot robot3 = new Robot("Sven");
        robot3.sayHello();
        robot3.sayYourName();

        Robot robot4 = new Robot("Kukusik");
        robot4.sayHello();
        robot4.sayYourName();
    }
}
