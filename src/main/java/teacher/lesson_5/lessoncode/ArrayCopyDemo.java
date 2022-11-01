package teacher.lesson_5.lessoncode;

public class ArrayCopyDemo {

    public static void main(String[] args) {

        String[] copyFrom = {"Red", "Black", "White", "Green", "Pink", "Yellow", "Blue", "Orange"};

        String[] copyTo = new String[6];

        System.arraycopy(copyFrom, 5, copyTo, 0, 6);

        CustomArrayUtils.printArrayToConsole(copyTo);

    }

}
