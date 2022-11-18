package students.student_svetlana_seda.lesson_5.homework.level_5and_6;
//1.В этом классе напишите автоматический тест
//для метода int[] createArray(int arrayLength)
//из предыдущего задания.
// Напишите реализацию !!!
// Проверьте, что метод создаёт массив указанной длины

//В этом классе напишите автоматический тест
//для метода int[] createArray(int arrayLength)
//из предыдущего задания.
class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    void shouldCreateArray() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 3;
        int expectedResult = 5;

        int[] realResult = arrayUtil.createArray(arrayLength);

        if (realResult.length == arrayLength) {
            System.out.println("Test Array Length = OK");
        } else {
            System.out.println("Test Array Length = FAIL");
        }
        System.out.println();
    }

    //task 36
    void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {5, 100, 40};

        System.out.println("Max Number of Array = " + ArrayUtil.findMaxNumber(numbers));

        int expectedResult = 100;
        int realResult = arrayUtil.findMaxNumber(numbers);
        if (expectedResult == realResult) {
            System.out.println("Max number test = OK");
        } else {
            System.out.println("Max number test = FAIL");
        }
        System.out.println();
    }

    //task 28
    void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {5, 100, 40};
        int expectedResult = 5;
        int realResult = arrayUtil.findMinNumber(numbers);
        if (expectedResult == realResult) {
            System.out.println("Min number test = OK");
        } else {
            System.out.println("Min number test = FAIL");
        }
        System.out.println("Min Number of Array = " + ArrayUtil.findMinNumber(numbers));
    }

}







