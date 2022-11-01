package students.student_vladislav_saksin;

public class RobotDemo {
    public static void main(String[] args) {

        Robot myRobot = new Robot();
        myRobot.sayHello();
        myRobot.sayYourName();
        myRobot.sayName();

        Robot robot1 = new Robot("Rider");
        robot1.sayHello();
        robot1.sayYourName();
        robot1.sayName();

        Robot robot2 = new Robot("John");
        robot2.sayHello();
        robot2.sayYourName();
        robot2.sayName();


    }

}