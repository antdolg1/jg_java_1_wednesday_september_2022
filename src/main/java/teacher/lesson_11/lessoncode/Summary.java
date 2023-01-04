package teacher.lesson_11.lessoncode;

import java.util.*;

public class Summary {

    //Consider
    //1. What collection needs to do
    //2. Are you using the fastest collection for your purposes. Think about insertion/deletion/iteration and retrieval.

    ///LIST///
    //Stores list(array) of objects
    //Duplicates are allowed
    //Objects remain in order they are added
    //Elements are indexed via an integer
    //Checking for particular element is quite slow
    //Checking by index is fast
    //Iterating through list is relatively fast
    //You can sort lists with Collection.sort()

    //If you want to add/remove in the end, use ArrayList
    List<String> list1 = new ArrayList<>();

    //Elsewhere use LinkedList
    List<String> list2 = new LinkedList<>();


    ///SET///
    //Only unique values
    //Great for removing duplicates
    //Not indexed, unlike lists
    //Checking is object exists is fast
    //If you want to use your own objects, you must implement/override equals() and hashCode() methods

    //Order is not important
    Set<String> set1 = new HashSet<>();

    //Order is as added
    Set<String> set2 = new LinkedHashSet<>();

    //Natural order
    Set<String> set3 = new TreeSet<>();


    ///MAP///
    //Key - value pairs
    //Lookup tables
    //Iterating through map is slow
    //If you want to use your own objects, you must implement/override equals() and hashCode() methods

    //order of keys is not important and it is okay if it changes
    Map<String, String> map1 = new HashMap<>();

    //keys are stored in a natural order
    Map<String, String> map2 = new TreeMap<>();

    //keys remain in order they were added
    Map<String, String> map3 = new LinkedHashMap<>();
}
