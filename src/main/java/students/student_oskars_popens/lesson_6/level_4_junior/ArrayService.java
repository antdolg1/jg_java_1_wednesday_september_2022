package students.student_oskars_popens.lesson_6.level_4_junior;

import java.util.Random;

class ArrayService {
    void fillTwoDimArray(int[][]array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(1000);
            }
        }
    }

    int sumTwoDimArray(int[][] array){
        int ret=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ret+= array[i][j];
            }
        }
        return ret;
    }
}
