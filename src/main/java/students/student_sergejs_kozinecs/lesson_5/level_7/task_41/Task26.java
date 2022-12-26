package students.student_sergejs_kozinecs.lesson_5.level_7.task_41;

public class Task26 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int arrayLength = arrayUtil.getArrayLengthFromUser();
		int[] array = arrayUtil.newArray(arrayLength);
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
	}

}
