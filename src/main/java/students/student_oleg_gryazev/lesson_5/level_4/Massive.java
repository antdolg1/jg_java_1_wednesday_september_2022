package students.student_oleg_gryazev.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Massive {

     public static void main(String[] args) {          // Task 26
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive lenght");
        int len = scanner.nextInt();
        int [] num = new int[len + 1];

for(int i = 0; i <= len ; i ++) {
    Random random = new Random();

    int number = random.nextInt(100);
   num[i] = number;

        System.out.println("Your numbers in order of array elements, from " + i + " = " + num [i] );
    }
}
    }
class Massive1 {

    public static void main(String[] args) {          // Task 25
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter massive length");
        System.out.println("Enter your numbers");
        int len = scanner.nextInt();
        int [] num = new int[len + 1];
       // Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <= len ; i ++) {
            int number = scanner.nextInt();
            num[i] = number;

            System.out.println("Your numbers in order of array elements, from " + i + " = " + num [i] );
        }
    }
}

class  Massive2 {                                   // Task 27
    static int[] num = {3,10,45,16,77,2};
        static int largest()
    {
        int i;
        int max = num[0];

            for (i = 1; i < num.length; i++)
            if (num[i] > max)
                max = num[i];
            System.out.println("Massive = " + Arrays.toString(num));
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Largest in given array is " + largest());
                }
            }

class  Massive3 {                                   // Task 28
    static int[] num = {3,10,45,16,77,2};
    static int smallest()
    {
        int i;
        int min = num[0];

        for (i = 1; i < num.length; i++)
            if (num[i] < min)
                min = num[i];
        System.out.println("Massive = " + Arrays.toString(num));
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Largest in given array is " + smallest());
    }
}

class  Massive4 {                                   // Task 29
    static int[] num = {3,10,45,16,77,2};
     //for (int i = 0; i < 5; int[i] = (i % 2 == 0 ? EVEN : ODD), i++);



        static void largest()
    {
        int i;
        int even = num[0];

        for (i = 1; i <= num.length; i++)
            if (num[i]%2 ==0){
               continue;
            }


        System.out.println("Massive = " + num[i]);
       // return even;
    }

    public static void main(String[] args) {
largest();

        //System.out.println("Largest in given array is " + largest());
    }
}
// Task 28




