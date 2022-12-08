package students.student_deniss_fiscevs.lesson05.level_2_intern;

import java.security.SecureRandom;

class Task_13 {

    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        byte[] number = new byte[3];
        random.nextBytes(number);

        System.out.println("First number = " + number[0]);
        System.out.println("Second number = " + number[1]);
        System.out.println("Third number = " + number[2]);
        System.out.println("___________________");
        int sumOfThree = number[0] + number[1] + number[2];
        System.out.println("Sum of these numbers is = " + sumOfThree);
    }
}
