package students.student_jurij_hlebnikov.homework;

public class ArrayUtilTest {
    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = arrayUtil.createArray(9);
        if (array.length == 9){
            System.out.println("Array length test: OK");
        }else {
            System.out.println("Array length test: FAIL");
        }

        // Проверьте, что метод создаёт массив указанной длины
    }
}
