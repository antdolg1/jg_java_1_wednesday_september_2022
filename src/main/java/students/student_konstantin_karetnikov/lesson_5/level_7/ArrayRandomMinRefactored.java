package students.student_konstantin_karetnikov.lesson_5.level_7;

class ArrayRandomMinRefactored {
    public static void main(String[] args) {
        new ArrayUtil();
        int[] array = ArrayUtil.newArray(10);
        ArrayUtil.fillArrayWithRandomNumbers(array);
        ArrayUtil.printArray(array);
        int minNumber = ArrayUtil.findMinInArray(array);
        System.out.println("Min number in array is: " + minNumber);
    }
}


