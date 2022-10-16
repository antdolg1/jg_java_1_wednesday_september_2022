package students.student_ignat_parfenov.lesson3.homework;

public class RobotDemo {
    public static void main(String[] args) {

        Robot firstRobot = new Robot();
        firstRobot.sayHello();
        firstRobot.sayYourName();

        Robot robot1 = new Robot();
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot();
        robot2.sayHello();
        robot2.sayYourName();

        Robot iAmRobot = new Robot();
        iAmRobot.name = "Footer";

        System.out.println("My name is: " + iAmRobot.name);



    }

    public RobotDemo() {

    }

}


