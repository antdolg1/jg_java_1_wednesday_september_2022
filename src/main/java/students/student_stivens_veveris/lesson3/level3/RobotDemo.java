package students.student_stivens_veveris.lesson3.level3;

public class RobotDemo {

    public static void main(String[] args) {

       Robot firstRobot = new Robot ();
       firstRobot.name = "ROBO";

       Robot secondRobot = new Robot();
       secondRobot.name = "ROBO2";

       Robot thirdRobot = new Robot();
       thirdRobot.name = "ROBO3";

       Robot fourthRobot = new Robot();
       fourthRobot.name = "ROBO4";


       System.out.println("First robot name = " + firstRobot.name + "!");
       System.out.println("Second robot name = " + secondRobot.name + "!");
       System.out.println("Third robot name = " + thirdRobot.name + "!");
       System.out.println("Fourth robot name = " + fourthRobot.name + "!");

    }
}