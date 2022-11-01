package students.student_mihhail_karasjov.Lesson3.Homework.Level1;

public class Robot {
    public void sayHello(String name){
        System.out.println("Hello! " + name);
    }
    public static void main(String[] args){
        Robot robot= new Robot();
        robot.sayHello("Bip...Bip ");
    }
}
