package teacher.lesson_6.lessoncode;

public class KahootQuizCode {

    static int[] a = {0, 2, 3, 4};

    public static int test(int v) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == v) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        System.out.println("test methods return resul when v = 3 is: " + test(1));

        //question 12
//        int x = 0;
//        while (x < 4) {
//            x = x + 1; //x++; or ++x;
//            System.out.println("Current x value is: " + x);
//        }
//        System.out.println("x is " + x);

        //question 13
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//            i++;
//            ++i;
//            i = i + 1;
//            System.out.println("Current i value is: " + i);

        //question 14
//        int y = 0;
//        for (int i = 0; i < 10; ++i) {
//            y += i; //same as y = y + i;
//            System.out.println("y value on iteration " + i + " is: " + y);
//        }
//        System.out.println(y);

        //question 15
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println(i * j);
//            }
//        }

        //question 16
//        int number = 6;
//        while (number > 0) {
//            number = number - 3; //same as: number -= 3;
//            System.out.print(number + " ");
//        }
    }
}
