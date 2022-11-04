package students.student_ilja_morozovs.lesson_6.homework.level_3.Task_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        ArrayService arrayService = new ArrayService();
        System.out.println("Please input array length: ");
        int[] arr = arrayServiceTest.createTestedArray(arrayServiceTest.testInputDate());
        System.out.println("Please input search number: ");
        arrayServiceTest.fillArrayTest(arr);
        //arrayServiceTest.fillArray(arr);
        System.out.println(Arrays.toString(arr));
        arrayServiceTest.condition(arrayService.contains(arr, arrayServiceTest.testInputDate()));
    }

    void condition(boolean state) {
        if (state) {
            System.out.println("Test is: OK");
        } else {
            System.out.println("Test is: FAIL");
        }
    }

    int testInputDate() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    int[] createTestedArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayTest(int[] arr) {
        int testNumber = 44;
        System.out.println("Tested number in array is :" + testNumber);
        arr[2] = testNumber;
    }

    int[] fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(100);
        }
        return arr;
    }
}
