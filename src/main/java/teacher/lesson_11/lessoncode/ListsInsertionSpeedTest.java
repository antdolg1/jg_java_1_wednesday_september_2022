package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsInsertionSpeedTest {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    public static void doTimings(String listType, List<Integer> list){

        for (int i = 0; i < 1_00_000; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            list.add(5000, i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken " + (endTime - startTime) + " ms for list type " + listType);

    }

}
