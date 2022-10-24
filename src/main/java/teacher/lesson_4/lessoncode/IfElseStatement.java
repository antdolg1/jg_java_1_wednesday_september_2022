package teacher.lesson_4.lessoncode;

public class IfElseStatement {

    public static void main(String[] args) {

        int number = 7;

        //if statement
        if (number == 7) {
            System.out.println("Number is seven!");
        }

        //if-else statement
        if (number == 7) {
            System.out.println("Number is seven!");
        } else {
            System.out.println("Print what is in else");
        }

        //if-elseif statement
        if (number > 1) {
            System.out.println("Number is greater than 1!");
        } else if (number == 0) {
            System.out.println("Number is zero!");
        } else if (number > 5) {
            System.out.println("Number is bigger than 5!");
        }

        //if-elseif-else statement
        if (number > 1) {
            System.out.println("Number is greater than 1!");
        } else if (number == 0) {
            System.out.println("Number is zero!");
        } else {
            System.out.println("Print what is in else");
        }
    }

}
