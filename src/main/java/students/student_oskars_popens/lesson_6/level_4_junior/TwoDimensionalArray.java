package students.student_oskars_popens.lesson_6.level_4_junior;

class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twoDimArray = new int[10][15];
        ArrayService arrayService = new ArrayService();
        int arraySum;
        arrayService.fillTwoDimArray(twoDimArray);

        arraySum = arrayService.sumTwoDimArray(twoDimArray);
        System.out.println("Array elements sum = " + arraySum);

    }
}
