package students.student_oskars_popens.lesson_6.level_4_junior;

// task_19
class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        int breakPoint = 0;
        for (int i = 0; i < 1; i = 0) {
            System.out.println("infinity for loop ");
            breakPoint++;
            if (breakPoint == 100) {
                System.out.println("Break");
                break;
            }
        }

    }
}
