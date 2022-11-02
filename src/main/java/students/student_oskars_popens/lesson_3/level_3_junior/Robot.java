package students.student_oskars_popens.lesson_3.level_3_junior;

class Robot {
    String name;

    Robot(String robotName){
        this.name = robotName;
    }

    void sayHello(){
        System.out.println("Hello");
    }
    void sayYourName(){
        System.out.println("My name is " + name);
    }

    void repeatYourName(){
        System.out.println("Repeated, my name is " + this.name);
    }
}
