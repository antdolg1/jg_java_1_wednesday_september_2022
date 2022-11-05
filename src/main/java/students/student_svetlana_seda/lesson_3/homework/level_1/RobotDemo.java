package students.student_svetlana_seda.lesson_3.homework.level_1;

class RobotDemo {
    public static void main(String[] args) {
        Robot firstRobot = new Robot("Gold");
        Robot secondRobot = new Robot("Silver");
        Robot thirdRobot = new Robot("Metal");
        firstRobot.sayHello();
        firstRobot.sayYourName();
        firstRobot.sayByeBye();
        System.out.println("___________");
        secondRobot.sayHello();
        secondRobot.sayYourName();
        secondRobot.sayByeBye();
        System.out.println("---------------");
        thirdRobot.sayHello();
        thirdRobot.sayYourName();
        thirdRobot.sayByeBye();
    }

}
