package teacher.lesson_6.lessoncode;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        //one dimensional array
        int[] values = {1, 22, 333, 4444};

        //multi dimensional array
        int[][] table = {
                {1, 22, 333, 4444},
                {2, 55},
                {44, 22222, 6666},
                {3}
        };

        for (int row = 0; row < table.length; row++) {
            for (int col = 0; col < table[row].length; col++) {
                System.out.println(table[row][col] + "\t");
            }
            System.out.println();
        }


//        System.out.println(table[0][0]);
//        System.out.println(table[0][2]);
//        System.out.println(table[2][2]);

//        String[][] texts = new String[3][3];
//        texts[2][2] = "Some text";
//
//        System.out.println(texts[2][2]);
//        System.out.println(texts[1][2]);
    }
}
