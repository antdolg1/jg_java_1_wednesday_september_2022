package students.student_zanna_klimova.lesson_5.level_5;

class ArrayUtilTest {
        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
        }

        void shouldCreateArray() {
            ArrayUtil arrayUtil = new ArrayUtil();
            int arrayLength = 3;
            int arrayLengthResult = 3;
            int[] realArrayResult = arrayUtil.createArray(arrayLength);
            checkArrayLength(realArrayResult, arrayLengthResult);
        }

        void checkArrayLength(int[] realArrayResult, int arrayLength) {
            if (realArrayResult.length == arrayLength) {
                System.out.println("Array length TEST = OK");
            } else {
                System.out.println("Array length TEST = FAIL");
            }
        }
    }

