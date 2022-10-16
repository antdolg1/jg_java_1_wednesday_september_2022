package students.student_oleg_gryazev;

public class Robot {
    public Robot() {
        String surname;

    }

        public void sayHello() {

            System.out.println("Hello");}
            public String sayYourName(String a) {

                System.out.println("My name is - " + a);
                return a;
            }
    }
class RobotDemo{
    public static void main(String[] args) { // Method 1
        Robot bot = new Robot();
        bot.sayHello();
        Robot name = new Robot();
        name.sayYourName("Robic");

        Robot bot2 = new Robot();           // Method 2
        bot2.sayHello();
        String a = "Rob";
        bot2.sayYourName(a);

        Robot bot3 = new Robot();           // Method 3
        bot3.sayHello();
        String b = "Tobor";
        a = b;
        bot3.sayYourName(a);

       // Robot bot4 = new Robot( );          // Method 4 ???

    }


}