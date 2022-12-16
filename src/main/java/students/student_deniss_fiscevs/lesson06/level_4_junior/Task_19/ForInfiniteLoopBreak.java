package students.student_deniss_fiscevs.lesson06.level_4_junior.Task_19;

class ForInfiniteLoopBreak {

    public static void main(String[] args) {

        for (int i = 1; i > 0; ++i) {
            if (i == 100) {
                break;
            }
            System.out.println(i);
        }
    }
}
