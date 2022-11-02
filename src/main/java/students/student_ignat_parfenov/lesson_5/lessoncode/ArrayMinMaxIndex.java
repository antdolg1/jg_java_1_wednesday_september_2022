package students.student_ignat_parfenov.lesson_5.lessoncode;

public class ArrayMinMaxIndex {

    public static void main(String[] args) {

        int[] minIndex = {2, 4, 7, 8, -9, 5};
        int min = minIndex[0];
        int max = minIndex[0];

        for (int i = 0; i < minIndex.length; i++) {
            if (min > minIndex[i]) {
                min = minIndex[i];
            }
        }
        for (int j = 0; j < minIndex.length; j++) {
            if (max < minIndex[j]) {
                max = minIndex[j];
            }
        }
        System.out.println("The minimum = " + min);
        System.out.println("The maximum = " + max);
    }
}
