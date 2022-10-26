package students.student_aleksandr_suhobokov;

public class Dog {

    String name;
    int age;
    boolean isBig;
    String color;

    public Dog(String name, int age, boolean isBig, String color) {
        this.name = name;
        this.age = age;
        this.isBig = isBig;
        this.color = color;
    }

    public Dog() {

    }


public Dog(String namethree, int age) {
    this.name = namethree;
    this.age = age;

    }

    void bark () {
        System.out.println("GAV GAV GAV!");

    }

    void greeting(String name) {
        String Vasja;
        String namethree = "Vasja";
        System.out.println("Privet, menja zovut: " + namethree );


    }

    int yearsAfterFiveYear(Dog myDog) {
        int currentAge = myDog.age;
        currentAge = currentAge + 5;
        return currentAge;
    }

}