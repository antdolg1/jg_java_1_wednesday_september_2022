package students.student_ignat_parfenov.lesson_5.lessoncode;

public class ArrayMinIndex {

    public static void main(String[] args) {

        int[] minIndex = {2, 4, 7, 8, 1, 99};
        int min = minIndex[0];

        for (int i = 0; i < minIndex.length; i++) {
            if (min < minIndex[i]) {
                min = minIndex[i];
            }
        }
        System.out.println("The minimum = " + min);
    }
}
