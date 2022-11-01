package students.student_artjoms_trosihins.lesson3_level5.task20;

class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println(name + age);
    }

    void happyBirthday() {
        age += 1;

    }

}
