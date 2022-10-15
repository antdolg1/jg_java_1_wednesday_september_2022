package students.student_ilja_morozovs.lessons_3.homework.level_3.Task_13;

class RobotDemo {
    public static void main(String[] args) {
        Robot terminator = new Robot("Arnold");
        Robot terminator1 = new Robot("Vasja");
        terminator.sayYourName();
        terminator.sayHello();
        System.out.println("____________________");
        terminator1.sayHello();
        terminator1.sayYourName();
    }
}
