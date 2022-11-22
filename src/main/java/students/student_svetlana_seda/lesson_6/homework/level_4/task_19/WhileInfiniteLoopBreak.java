package students.student_svetlana_seda.lesson_6.homework.level_4.task_19;

//продемонстрируйте
//выход из бесконечного цикла реализованного при помощи цикла while.
class WhileInfiniteLoopBreak {

    public static void main(String[] args) {
        int number = 1;
        while (number > 0) {
            System.out.println("Infinite while loop!");
            number++;
            if (number > 0) {
                break;
            }
        }
    }

}
