package students.student_jurij_hlebnikov.homework_leson_6;

class TwoDimensionalArray {             //Task 21

    public static void main(String[] args) {

        TwoDimensionalArrayMethods twoDimensionalArray = new TwoDimensionalArrayMethods();

        int sum = 0;
        int axisX = twoDimensionalArray.mathRandom();
        int axisY = twoDimensionalArray.mathRandom();
        int[][] array = new int[axisX][axisY];

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = (int) (Math.random() * 10 + 1);

                System.out.print(array[x][y] + "    ");
                sum += array[x][y];
            }
            System.out.println();
        }
        System.out.println("Sum of all number is :" + sum);
    }
}
