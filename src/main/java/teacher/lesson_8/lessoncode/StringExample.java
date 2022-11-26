package teacher.lesson_8.lessoncode;

public class StringExample {

    public static void main(String[] args) {

        char[] charArray = {'J','a','v','a','_','c','o','o','l'};
        String ourString = new String(charArray);
        System.out.println(ourString);

        String string1 = "Ferrari";
        int stringLength = string1.length();
        System.out.println("string1 length is " + stringLength);

        System.out.println("String ".concat("Another String"));

        float myFloat = 3.14f;
        int myInt = 10;
        String myString = "some text";

        System.out.printf("MyFloat value = %f, myInt value = %d and myString value = %s", myFloat, myInt, myString);

        String string1Uppercase = string1.toUpperCase();
        System.out.println();
        System.out.println(string1Uppercase);

        char myChar = string1.charAt(4);
        System.out.println(myChar);

        String newFerrari = string1.replace("r", "w");
        System.out.println(newFerrari);

        String stringWithSpaces = " Ferrari ";
        String stringWithoutSpaces = stringWithSpaces.trim();
        System.out.println(stringWithSpaces);
        System.out.println(stringWithoutSpaces);

        String stringToSplit = "qwert-tyu-12fa-fsds123";
        String[] splitArray = stringToSplit.split("-");

        System.out.println(splitArray[0]);
        System.out.println(splitArray[1]);
        System.out.println(splitArray[2]);
        System.out.println(splitArray[3]);
    }

}
