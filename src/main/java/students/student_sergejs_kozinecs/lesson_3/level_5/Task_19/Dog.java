package students.student_sergejs_kozinecs.lesson_3.level_5.Task_19;

public class Dog {

    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println((this.name + ' ' + this.age));
    }

}
