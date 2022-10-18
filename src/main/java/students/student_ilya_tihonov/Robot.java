package students.student_ilya_tihonov;


public class Robot {

    public void sayHello() { System.out.println("Hello!"); }


    String name;

    Robot(String robotName){
        this.name = robotName;
    }

    void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
