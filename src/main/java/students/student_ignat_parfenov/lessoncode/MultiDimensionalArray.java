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



        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table[row].length; column++);

        }

    }


}

