package students.student_sergejs_kozinecs.lesson_3.level_5.Task_18;

class Dog {

    String name;

    Dog(String name) {
        this.name = name;
    }

    void voice() {
        System.out.println((this.name + '\n').repeat(3));
    }
}
