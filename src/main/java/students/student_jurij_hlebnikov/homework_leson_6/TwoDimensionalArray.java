package students.student_jurij_hlebnikov.homework_leson_6;

class TwoDimensionalArray {

    public static void main(String[] args) {

        int axisX = (int) (Math.random() * 10 + 1);
        int axisY = (int) (Math.random() * 10 + 1);
        int[][] array = new int[axisX][axisY];

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[x].length; y++) {
                array[x][y] = (int) (Math.random() * 10 + 1);

                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }
    }
}
