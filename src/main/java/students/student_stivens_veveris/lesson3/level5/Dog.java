package students.student_stivens_veveris.lesson3.level5;

public class Dog {

    String name = "Bublik";
    String color;
    String newColor;
    int age;
    public Dog(int age) {
        this.age = age;
    }

    void voice() {System.out.println(name + ", " + name + ", " + name + "!");}
    void voice2() { System.out.println(name + " is " + age + " years old! His color is " + color + "!"); }

    int happyBirthday(Dog firstDog) {
        int currentAge = firstDog.age;
        currentAge = currentAge + 1;
        return currentAge;
    }
    void changeColor(String newColor) {System.out.println("Your new color is " + newColor + "!");}

    public Dog () {
    }

}
