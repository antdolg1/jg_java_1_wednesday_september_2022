package students.student_ignat_parfenov.lessoncode;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        //  one dimensional array
        int[] values = {1, 22, 333, 76};
        //  multi dimensional array
        int[][] table = {
                {1, 22, 333, 444},
                {2, 55},
                {4, 56, 78, 76},
                {3}
        };
        System.out.println(table[0][0]);
        System.out.println(table[0][2]);
        System.out.println(table[2][2]);

        String[][] text = new String[3][3];
        text[0][2] = "Ooops!";
        System.out.println(text[2][2]);

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.println(table[row][col]);
            }
            System.out.println();
        }
    }


}

