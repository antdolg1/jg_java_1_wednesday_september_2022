package students.student_konstantin_karetnikov.lesson_5.level_7;


class ArrayRandomMaxRefactored {
    public static void main(String[] args) {
        new ArrayUtil();
        int[] array = ArrayUtil.newArray(10);
        ArrayUtil.fillArrayWithRandomNumbers(array);
        ArrayUtil.printArray(array);
        int maxNumber = ArrayUtil.findMaxInArray(array);
        System.out.println("Max number in array is: " + maxNumber);
            }
    }

