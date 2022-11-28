package students.student_jurij_hlebnikov.homework_leson_6;

class WhileInfiniteLoopBreak {

    public static void main(String[] args) {


        int i = 0;
        while (true) {
            System.out.println(++i);
            if (i == 20) {
                break;
            }
        }
    }
}
