package students.student_artjoms_trosihins.lesson_3.level_5.task21;

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
        System.out.println(name + age + color);
    }
}
