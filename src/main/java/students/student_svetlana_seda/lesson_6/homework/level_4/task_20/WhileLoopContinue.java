package students.student_svetlana_seda.lesson_6.homework.level_4.task_20;

//продемонстрируйте
//как досрочно закончить текущую итерацию цикла while.
class WhileLoopContinue {

    public static void main(String[] args) {
        int number = 1;
        while (number > 0) {
            number++;
            if (number == 3) {
                continue;
            }
            System.out.println("Infinite while loop! - continue");
        }
    }

}
