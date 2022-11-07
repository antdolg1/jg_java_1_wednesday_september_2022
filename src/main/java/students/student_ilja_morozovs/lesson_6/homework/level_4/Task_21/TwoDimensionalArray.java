package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_21;

class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionArrayUtil twoDimensionArrayUtil = new TwoDimensionArrayUtil();
        int[][] arr;
        arr = twoDimensionArrayUtil.arrayCreating(5);
        twoDimensionArrayUtil.fillArray(arr);
        twoDimensionArrayUtil.showTwoDimArr(arr);
        System.out.println("Sum of all numbers in two dimensional array is: " + twoDimensionArrayUtil.arraySum(arr));
    }
}
