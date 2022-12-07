package teacher.lesson_10.lessoncode.ArrayAdvanced;

public class IntArrayImplTest {

    public static void main(String[] args) {
        IntArrayImplTest test = new IntArrayImplTest();
        test.addTest();
        test.getByIndexTest();
        test.removeByIndexTest();
    }

    public void addTest() {
        IntArrayImpl array = new IntArrayImpl();
        array.add(1);
        array.add(2);
        array.add(3);

        int expectedValue = 3;
        int realValue = array.size();

        if (realValue == expectedValue) {
            System.out.println("Test 'addTest' PASSED!");
        } else {
            System.out.println("Test 'addTest' FAILED!");
        }
    }

    public void getByIndexTest() {
        IntArrayImpl array = new IntArrayImpl();
        array.add(2);
        array.add(5);
        array.add(8);

        int realValue = array.getByIndex(2);
        int expectedValue = 8;

        if (realValue == expectedValue) {
            System.out.println("Test 'getByIndexTest' PASSED");
        } else {
            System.out.println("Test 'getByIndexTest' FAILED");
        }
    }

    public void removeByIndexTest() {
        IntArrayImpl array = new IntArrayImpl();
        array.add(1);
        array.add(2);
        array.add(3);

        array.removeByIndex(0);
        array.removeByIndex(0);
        array.removeByIndex(0);

        int realValue = array.size();
        int expectedValue = 0;

        if (realValue == expectedValue) {
            System.out.println("Test 'removeByIndexTest' PASSED!");
        } else {
            System.out.println("Test 'removeByIndexTest' FAILED!");
        }
    }

}
