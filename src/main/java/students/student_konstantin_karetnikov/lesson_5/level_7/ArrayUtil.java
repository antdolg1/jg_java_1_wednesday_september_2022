package students.student_konstantin_karetnikov.lesson_5.level_7;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    public static int getArrayLengthFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter array length: ");
		return scanner.nextInt();
	}

    public static int [] newArray(int arrayLength) {
        return new int [arrayLength];
    }

    public static void fillArray(int[] newArray) {
		Scanner scanner = new Scanner(System.in);
        for (int i=0; i<newArray.length; i++) {
            System.out.println("Please input element Nr."+(i+1));
            newArray[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array) {
        System.out.print("Array: [ ");
        for (int element: array) {
            System.out.print(element+" ");
        }
        System.out.println("]"+"\n");
    }

    public static void fillArrayWithRandomNumbers(int[] newArray){
        Random random = new Random ();
        for (int i=0; i<newArray.length; i++) {
            newArray[i] = random.nextInt(100);
        }
    }

    public int [] newArrayWithRandomLength() {
        Random random = new Random();
        return new int [random.nextInt(24)+1];
    }

    public static int findMaxInArray(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) max =element;
        }
        return max;
    }

    public static int findMinInArray(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
            	min =element;
			}
        }
        return min;
    }

    public static void printEvenNumbersOfArray(int[] array) {
        System.out.print("Even elements from array: ");
        for (int element : array) {
            if (element % 2 == 0){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

    public static void printOddNumbersOfArray(int[] array) {
        System.out.print("Odd elements from array: ");
        for (int element : array) {
            if (element % 2 != 0){
                System.out.print(element+" ");
            }
        }
        System.out.println();
    }

}
