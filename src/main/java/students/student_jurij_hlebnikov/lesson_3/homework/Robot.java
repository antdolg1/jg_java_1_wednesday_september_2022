package students.student_jurij_hlebnikov.lesson_3.homework;

public class Robot {

    String name;

    Robot(String robotName){
        this.name = robotName;
    }

    public void sayHello( ) {
        System.out.println("Hello!");
    }

    public Robot(){

    }
public void sayYourName(){
    System.out.println("My name is " + this.name);
}

}
