package teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static final String GIRAFFE = "Giraffe";

    public static void main(String[] args) {

        List<String> animalsList = new ArrayList<>(10);

        animalsList.add("Dog");
        animalsList.add("Cat");
        animalsList.add("Turtle");
        animalsList.add("Tiger");
        animalsList.add("Elephant");
        animalsList.add(1, "Leopard");
        animalsList.add(GIRAFFE);
        animalsList.add(GIRAFFE);
        animalsList.add(GIRAFFE);
        animalsList.add(GIRAFFE);
        animalsList.add(GIRAFFE);
        //11th element
        animalsList.add(GIRAFFE);

        System.out.println(animalsList);
        System.out.println("ArrayList animalsList size is: " + animalsList.size());
        animalsList.remove("Cat");

//        animalsList.clear();
        System.out.println(animalsList);
        System.out.println("ArrayList animalsList size is: " + animalsList.size());


        List<Integer> numbersLinkedList = new LinkedList<>();

        numbersLinkedList.add(32);
        numbersLinkedList.add(122);
        numbersLinkedList.add(2);
        numbersLinkedList.add(2);
        numbersLinkedList.add(54);
        numbersLinkedList.add(7388222);
        numbersLinkedList.add(73838);

        System.out.println("LinkedList contents: " + numbersLinkedList);

        Collections.sort(numbersLinkedList);
        System.out.println("LinkedList contents after sorting: " + numbersLinkedList);

        Collections.sort(animalsList);
        System.out.println("ArrayList contents after sorting: " + animalsList);








    }

}
