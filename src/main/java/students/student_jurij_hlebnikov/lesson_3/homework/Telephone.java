package students.student_jurij_hlebnikov.lesson_3.homework;

import java.util.Scanner;

class Telephone {           // Task 29

    int buttons;
    String sms;
    String ringTon;

    public Telephone(int buttons, String sms, String ringTon) {
        this.buttons = buttons;
        this.sms = sms;
        this.ringTon = ringTon;
    }

    public Telephone() {
    }

    public void music() {
        System.out.println("Music Menu");
        System.out.println("Press Number 1-5");
        Scanner scanner = new Scanner(System.in);
        buttons = scanner.nextInt();
        System.out.println("");
        if (buttons == 1) {
            System.out.println("Play Lady GAGA");
        }
        if (buttons == 2) {
            System.out.println("Play RamStein");
        }
        if (buttons == 3) {
            System.out.println("Play Eminem");
        }
        if (buttons == 4) {
            System.out.println("Chanson");
        }
        if (buttons == 5) {
            System.out.println("GooG night kids");
        }
    }

}
