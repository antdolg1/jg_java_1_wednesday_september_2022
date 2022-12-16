package students.student_deniss_fiscevs.lesson06.level_4_junior.Task_19;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {

        int number = 1;
        while (number > 0) {
            System.out.println(number);
            number++;
            if (number == 100) {
                break;
            }
        }
    }

}