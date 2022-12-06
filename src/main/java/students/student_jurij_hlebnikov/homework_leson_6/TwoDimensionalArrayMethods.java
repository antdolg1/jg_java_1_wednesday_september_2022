package students.student_jurij_hlebnikov.homework_leson_6;

class TwoDimensionalArrayMethods {


    public int generateRandomNumber() {
        return (int) (Math.random() * 10 + 1);
    }

    public int[][] initArr(int x, int y) {
        return new int[x][y];
    }

    public int[][] fillArrayRandomNumbers(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y] = generateRandomNumber();
            }
        }
        return arr;
    }

    public void printArray(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + "   ");
            }
            System.out.println("  ");
        }
    }

    public int arraySum(int[][] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                sum += arr[x][y];
            }
        }
        return sum;
    }
}