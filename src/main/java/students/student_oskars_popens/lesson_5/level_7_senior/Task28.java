package students.student_oskars_popens.lesson_5.level_7_senior;

public class Task28 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		int minNumber = arrayUtil.findMinInArray(array);
		System.out.println("Min number = " + minNumber);
	}

}
