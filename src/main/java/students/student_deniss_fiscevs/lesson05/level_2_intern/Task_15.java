package students.student_deniss_fiscevs.lesson05.level_2_intern;

import java.security.SecureRandom;

class Task_15 {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        byte[] number = new byte[3];
        random.nextBytes(number);

        System.out.println("First number = " + number[0]);
        System.out.println("Second number = " + number[1]);
        System.out.println("Third number = " + number[2]);
        System.out.println("___________________");
        int escalateOnTwoFirstNumber = number[0] + 2;
        int escalateOnTwoSecondNumber = number[1] + 2;
        int escalateOnTwoThirdNumber = number[2] + 2;
        System.out.println("First number + 2 = " + escalateOnTwoFirstNumber);
        System.out.println("Second number + 2 = " + escalateOnTwoSecondNumber);
        System.out.println("Third number + 2 = " + escalateOnTwoThirdNumber);

    }

}
