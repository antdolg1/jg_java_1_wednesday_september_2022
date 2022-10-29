package students.student_oleg_gryazev.lesson_4.level_5;

import java.util.Scanner;

public class LightColorDetector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int color = scanner.nextInt();

        if (380 <= color & color <= 449  ){
            System.out.println("Violet"); }
        else if (450 <= color && color <= 494){
            System.out.println("Blue");}
        else if (495 <= color && color <= 569){
            System.out.println("Green");}
        else if (570 <= color && color <= 589){
            System.out.println("Yellow");}
        else if (590 <= color && color <= 619){
            System.out.println("Orange");}
        else if (620 <= color && color <= 750){
            System.out.println("Red");}
        System.out.println("Invisible Light");
    }
}




      //  switch (color) {



          /*  case 1:
                if (380 >= color && color <= 449) {

                    light.violet = color;
                    light.colorLightDetermination(light.violet);

                    // System.out.println("Color violet confirmed.");
                } else {
                    System.out.println("Not violet");
                }
                break;*/

       //
        //  light.lightMassive();

       //




