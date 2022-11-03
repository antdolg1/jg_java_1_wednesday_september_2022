package students.student_svetlana_seda.lesson_3.homework.level_1;

class Robot {
    String name;

    public void sayHello() {
        System.out.println("Hello!");
    }

    Robot(String name) {
        this.name = name;
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name + ".");
    }

    public void sayByeBye() {
        System.out.println("Bye!");
    }

    public Robot() {
    }

}
