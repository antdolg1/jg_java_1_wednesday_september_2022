package students.student_danila_kolesnicenko.lesson3;

class Robot {

    String name = "defaultname";
    Robot(String robotName) {

        this.name = robotName;
    }

    public Robot() {
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    public void sayYourName() {
        System.out.println("My name is " + name);
    }

}


