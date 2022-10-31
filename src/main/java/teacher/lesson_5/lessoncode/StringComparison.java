package teacher.lesson_5.lessoncode;

public class StringComparison {

    public static void main(String[] args) {

        String name = "John";
        String name2 = name;

        System.out.println("name value is: " + name);
        System.out.println("name2 value is: " + name2);

        if (name == name2) {
            System.out.println("name & name2 refers to the same string");
            System.out.println("---------------------------------------");
        } else {
            System.out.println("name & name2 does not refer to the same string");
            System.out.println("---------------------------------------");
        }

        String animal = "Dog";
//        String animal2 = "Dog";
        String animal2 = new String("Dog");


        System.out.println("animal value is: " + animal);
        System.out.println("animal2 value is: " + animal2);

        //incorrect way to compare strings
        if (animal == animal2) {
            System.out.println("animal & animal2 refers to the same string");
            System.out.println("---------------------------------------");
        } else {
            System.out.println("animal & animal2 does not refer to the same string");
            System.out.println("---------------------------------------");
        }

        //correct way to compare strings
        if (animal.equals(animal2)) {
            System.out.println("animal & animal2 refers to the same string");
            System.out.println("---------------------------------------");
        } else {
            System.out.println("animal & animal2 does not refer to the same string");
            System.out.println("---------------------------------------");
        }

    }

}
