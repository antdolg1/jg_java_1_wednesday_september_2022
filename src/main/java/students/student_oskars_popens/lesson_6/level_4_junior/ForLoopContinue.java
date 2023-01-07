package students.student_oskars_popens.lesson_6.level_4_junior;

// task_20
class ForLoopContinue {
    public static void main(String[] args) {
        int increaseBeforeContinue=0;
        int increaseAfterContinue=0;
        for (int i = 0; i < 100; i++) {
            increaseBeforeContinue++;
            if (increaseAfterContinue > 10)
            {
                continue;
            }
            increaseAfterContinue++;
        }
        System.out.println("increaseBeforeContinue: " + increaseBeforeContinue +
                " increaseAfterContinue: " + increaseAfterContinue);

    }
}
