package students.student_ilja_morozovs.lesson_3.homework.level_5.Task_21;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    public Dog(String dogName, String dogColor, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    void voice() {
        System.out.println("Dog name: " + dogName);
        System.out.println("Dog age: " + dogAge);
        System.out.println("Dog color: " + dogColor);
    }

}
