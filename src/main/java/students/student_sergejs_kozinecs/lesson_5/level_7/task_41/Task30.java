package students.student_sergejs_kozinecs.lesson_5.level_7.task_41;

public class Task30 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		arrayUtil.printOddNumbersOfArray(array);
	}

}
