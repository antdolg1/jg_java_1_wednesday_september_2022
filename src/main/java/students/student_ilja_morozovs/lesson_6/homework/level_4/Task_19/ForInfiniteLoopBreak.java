package students.student_ilja_morozovs.lesson_6.homework.level_4.Task_19;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i < i + 1; i++) {
            System.out.println("Learning Java.");
            if (i>10){
                break;
            }
        }
    }
}
