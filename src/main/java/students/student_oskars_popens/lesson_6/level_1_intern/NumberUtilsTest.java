package students.student_oskars_popens.lesson_6.level_1_intern;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest utilsTest = new NumberUtilsTest();
        utilsTest.isEvenTest();
    }

    public void isEvenTest (){
        NumberUtils utils = new NumberUtils();
        boolean expectedValue = true;
        boolean realValue = utils.isEven(98834);
        if ( expectedValue == realValue){
            System.out.println("Even test is = OK");
        } else {
            System.out.println("Even test is = FAIL");
        }
    }
}
