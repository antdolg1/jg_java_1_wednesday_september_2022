package students.student_sergejs_kozinecs.lesson_5.level_7.task_41;

public class Task27 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		int maxNumber = arrayUtil.findMaxInArray(array);
		System.out.println("Max number = " + maxNumber);
	}

}
