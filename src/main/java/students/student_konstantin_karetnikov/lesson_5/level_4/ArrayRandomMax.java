package students.student_konstantin_karetnikov.lesson_5.level_4;

class ArrayRandomMax {
    public static void main(String[] args) {

        System.out.println("Create an array of random length");
        int size = (int) (Math.random() *  10);
        int[] numbers = new int[size];
        System.out.println("_______________________________________");
        System.out.println("The array is filled with random numbers");
        System.out.println("_______________________________________");
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() *  100);
        }
        System.out.println("Numbers[] elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + numbers[i]);
        }
            System.out.println("\n");

        int maxNumber = numbers[0];
        for (int i = 0; i < size; i++) maxNumber = Math.max(maxNumber, numbers[i]);
        System.out.println("_______________________________________");
        System.out.println("Max number of Numbers[] array is: " + maxNumber);

        }
    }

