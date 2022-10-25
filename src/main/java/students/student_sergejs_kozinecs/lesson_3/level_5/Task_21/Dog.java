package students.student_sergejs_kozinecs.lesson_3.level_5.Task_21;

class Dog {

    String name;
    int age;
    String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println((this.name + ' ' + this.age + ' ' + this.color));
    }

    void happyBirthday() {
        this.age += 1;
    }
}
