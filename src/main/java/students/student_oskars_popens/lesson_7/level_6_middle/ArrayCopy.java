package students.student_oskars_popens.lesson_7.level_6_middle;

class ArrayCopy {
    int[] copyInRange(int[] array, int minNr, int maxNr) {
        int[] retArray = new int[countPassedElements(array,minNr,maxNr)];
        int arrayElement=0;
        for (int nr : array) {
            if (nr >= minNr && nr <= maxNr){
                retArray[arrayElement++]=nr;
            }
        }
        return retArray;
    }

    private int countPassedElements(int[] array, int minValue, int maxValue) {
        int retValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= minValue && array[i]<=maxValue){
                retValue++;
            }
        }
        return retValue;
    }
}
