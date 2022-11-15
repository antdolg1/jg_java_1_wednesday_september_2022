package students.student_deniss_fiscevs.lesson06.level_4_junior.Task_20;

class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {

            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;

        }
    }
}