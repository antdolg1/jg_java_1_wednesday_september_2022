package students.student_jurij_hlebnikov.homework_leson_6;

class TwoDimensionalArray {             //Task 21

    public static void main(String[] args) {

        TwoDimensionalArrayMethods twoDimensionalArray = new TwoDimensionalArrayMethods();

        int axisX = twoDimensionalArray.generateRandomNumber();
        int axisY = twoDimensionalArray.generateRandomNumber();

        int[][] array = twoDimensionalArray.initArr(axisX, axisY);
        twoDimensionalArray.printArray(array);
        System.out.println("+++++++++++++++++++++++++");
        int[][] filledArray = twoDimensionalArray.fillArrayRandomNumbers(array);

        twoDimensionalArray.printArray(filledArray);
        int sum = twoDimensionalArray.arraySum(filledArray);
        System.out.println("Sum of all number is :" + sum);
    }
}
