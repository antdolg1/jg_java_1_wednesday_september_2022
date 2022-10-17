package students.student_igor_budnitski.lesson_3.homework.level_5;

class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Charlie", 4, "black");
        dog1.voice();
        dog1.happyBirthday();
        dog1.voice();
        dog1.changeColor("gold");
        dog1.voice();
    }
}
