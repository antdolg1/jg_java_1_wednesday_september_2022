package students.student_deniss_fiscevs.lesson06.level_4_junior.Task_20;

class ForLoopContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i > 5)
                continue;
            System.out.println(i);
        }
    }

}