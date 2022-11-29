package students.student_jurij_hlebnikov.homework_leson_6;

class ForInfiniteLoopBreak {

    public static void main(String[] args) {


        for (int b = 0; b < 1; b = b - 2) {
            System.out.println(b);
            if (b == -12) {
                break;
            }
        }
    }
}

