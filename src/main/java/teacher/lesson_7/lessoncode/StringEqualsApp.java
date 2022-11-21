package teacher.lesson_7.lessoncode;

public class StringEqualsApp {

    public static void main(String[] args) {

        String emptyString = "";
        String blankString = " ";
        String text1 = "Today is WEDNESDAY!";
        String text2 = "Today is wednesday!";
        String text3 = new String("Today is wednesday!");

        System.out.println("text1 == text2 - " + (text1 == text2));
        System.out.println("text1 == text3 - " + (text1 == text3));
        System.out.println("text1 is equal to text3 - " + text1.equals(text3));
        System.out.println("text1 is equal to text3 - " + text1.equalsIgnoreCase(text3));

    }

}
