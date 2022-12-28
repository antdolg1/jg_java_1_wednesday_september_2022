package teacher.lesson_11.lessoncode;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        //set does not allow duplicates
        Set<String> set = new HashSet<>();
        set.add("Riga");
        set.add("Liepaja");
        set.add("Ventspils");
        set.add("Ventspils");
        set.add("Ogre");
        set.add("Jelgava");
        set.add("Jelgava");

        System.out.println("HashSet contents: " + set);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Riga");
        treeSet.add("Liepaja");
        treeSet.add("Ventspils");
        treeSet.add("Ventspils");
        treeSet.add("Ogre");
        treeSet.add("Jelgava");
        treeSet.add("Jelgava");

        System.out.println("TreeSet contents: " + treeSet);

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Riga");
        linkedHashSet.add("Liepaja");
        linkedHashSet.add("Ventspils");
        linkedHashSet.add("Ventspils");
        linkedHashSet.add("Ogre");
        linkedHashSet.add("Jelgava");
        linkedHashSet.add("Jelgava");

        System.out.println("TreeSet contents: " + linkedHashSet);
    }
}
