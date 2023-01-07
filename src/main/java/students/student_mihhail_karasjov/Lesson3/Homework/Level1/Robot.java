package students.student_mihhail_karasjov.Lesson3.Homework.Level1;

public class Robot {
    String name;

    public Robot() {
    }

    public void sayHello() {
        System.out.print("Hello! ");
    }

    public Robot(String name) {
        this.name = name;
    }


    public void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}

