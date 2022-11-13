package students.student_jurij_hlebnikov.lesson_3.homework;

class AfterBurner {

    String name;
    int speedModifier;

    public AfterBurner(String name, int speedModifier) {
        this.name = name;
        this.speedModifier = speedModifier;
    }

    public void showInfo() {
        System.out.println("AB Name: " + name);
        System.out.println("AB Speed: " + speedModifier);
    }
}
