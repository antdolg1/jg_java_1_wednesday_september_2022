package students.student_jurij_hlebnikov.homework_leson_6;

class WhileLoopContinue {

    public static void main(String[] args) {

        int i = 10;
        while (i > 0) {
            i++;
            if (i % 2 != 0) {
                continue;
            }
            if (i == 22) {
                break;
            }
            System.out.println(++i);
        }

    }

}

