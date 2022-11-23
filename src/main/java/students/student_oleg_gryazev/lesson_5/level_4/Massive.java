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
        System.out.println("Smallest in given array is " + smallest());
    }
}

class  Massive4 {                                // Task 29

    static int[] num = new int[5];
    static Random random = new Random();
    static void randomMassive() {
    for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            System.out.print("randomMassive = " + num[i] + "; ");
        }
    }
      static   void  evenNumber(){
            for (int i = 0; i < num.length; i++){
                if (num [i] % 2 == 0){
                    System.out.print("\nEven numbers of random massive = " + num [i]);
                }
            }
        }
        public static void main(String[] args) {
                 randomMassive();
                 evenNumber();
        }
             }


class Massive5{
static int[] num = new int[5];
    static Random random = new Random();
    static void randomMassive() {
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            System.out.print("randomMassive = " + num[i] + "; ");
        }
    }
    static   void  oddNumber(){
        for (int i = 0; i < num.length; i++){
            if (num [i] % 2 != 0){
                System.out.print("\nOdd numbers of random massive = " + num [i]);
            }
        }
    }
    public static void main(String[] args) {
        randomMassive();
        oddNumber();
    }
}










