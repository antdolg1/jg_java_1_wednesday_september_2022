package students.student_svetlana_seda.lesson_5.homework.level_5.task_32;
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
    }

    void shouldCreateArray() {

        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 3;
        int expectedResult = 5;

        int[] realResult = arrayUtil.createArray(arrayLength);
        testArrayLenght(realResult, expectedResult);
    }

    void testArrayLength(int[] realResult, int arrayLength) {
        if (realResult.length == arrayLength) {
            System.out.println("Test Array Length = OK");
        } else {
            System.out.println("Test Array Length = FAIL");
        }
    }

}

//НЕПОНИМАЮ, ЧТО ДЕЛАЮ НЕ ТАК(((

