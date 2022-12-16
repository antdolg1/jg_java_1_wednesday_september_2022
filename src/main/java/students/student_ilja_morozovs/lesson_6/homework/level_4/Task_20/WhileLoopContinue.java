package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_20;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            i++;
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
