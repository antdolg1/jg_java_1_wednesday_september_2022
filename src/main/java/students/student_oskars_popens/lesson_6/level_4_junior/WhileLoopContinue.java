package students.student_oskars_popens.lesson_6.level_4_junior;

// task_20
class WhileLoopContinue {
    public static void main(String[] args) {
        int increaseBeforeContinue=0;
        int increaseAfterContinue=0;
        while (true) {
            System.out.println("increaseBeforeContinue: " + increaseBeforeContinue +
                    " increaseAfterContinue: " + increaseAfterContinue);
            increaseBeforeContinue++;
            if (increaseBeforeContinue > 100)
            {
                break;
            }
            if (increaseAfterContinue > 10)
            {
                continue;
            }
            increaseAfterContinue++;
        }
    }
}
