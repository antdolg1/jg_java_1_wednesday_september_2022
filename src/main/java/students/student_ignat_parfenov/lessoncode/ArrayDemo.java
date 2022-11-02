package students.student_ignat_parfenov.lessoncode;

public class ArrayDemo {

    public static void main(String[] args) {

        int arrayLength = ArrayUtils.getArrayLengthFromUSer();
        int[] array = ArrayUtils.createArray(arrayLength);
        ArrayUtils.fillArrayWithNumbersFromUSer(array);
        ArrayUtils.printArrayToConsole(array);
        System.out.println("Max value is " + ArrayUtils.findMaxNumberInArray(array));
    }
}
