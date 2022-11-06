package students.student_jurij_hlebnikov.homework_leson_6;

public class NumberUtilsTest {

    public static void main(String[] args) {

        NumberUtils testNumberUtils = new NumberUtils();
        boolean isEven = testNumberUtils.isEven(78);
        if (isEven) {
            System.out.println("Test is Even: OK");
        } else {
            System.out.println("Test is Even: FAIL");
        }
    }
}
