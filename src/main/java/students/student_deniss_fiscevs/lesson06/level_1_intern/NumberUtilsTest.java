package students.student_deniss_fiscevs.lesson06.level_1_intern;

class NumberUtilsTest {

    public static void main(String[] args){

        NumberUtilsTest test = new NumberUtilsTest();
        test.shouldClassifyEvenOrNot();
    }

    void shouldClassifyEvenOrNot() {
        NumberUtils victim = new NumberUtils();
        int number = 2;
        boolean expectedResult = true;
        boolean actualResult = victim.isEven(number);
        if (expectedResult == actualResult) {
            System.out.println("Test = OK");
        } else {
            System.out.println("Test = FAIL");
        }
    }

}