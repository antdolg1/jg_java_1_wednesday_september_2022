package teacher.lesson_11.lessoncode;

import java.util.*;

public class MapsDemo {

    public static void main(String[] args) {

        //not sorted
        Map<Integer, String> hashMap = new HashMap<>();
        //sorted in a way added
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //sorted in a natural order (1,2,3...) or (a,b,c...)
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(1, "Ferrari");
        hashMap.put(2, "Porsche");
        hashMap.put(3, "Subaru");
        hashMap.put(4, "VAZ");
        hashMap.put(5, "RAF");
        hashMap.put(82, "Ford");
        hashMap.put(5, "VW");

        System.out.println("HashMap contents: " + hashMap);

        String car = hashMap.get(2);
        System.out.println("HashMap value under key 2 is: " + car);

        boolean containsFerarri = hashMap.containsValue("Ferrari");
        System.out.println("HashMap contains Ferarri - " + containsFerarri);

        boolean containsKey = hashMap.containsKey(82);
        System.out.println("HashMap contains key 82 - " + containsKey);

        Set<Integer> hashMapKeys = hashMap.keySet();
        System.out.println("HashMapKeys are: " + hashMapKeys);

        ArrayList<String> hashMapValues = new ArrayList<>(hashMap.values());
        System.out.println("HashMapValues are: " + hashMapValues);

        System.out.println("HashMap size: " + hashMap.size());
//        hashMap.clear();
//        System.out.println(hashMap);

        Map<String, Integer> myTreeMap = new TreeMap<>();
        myTreeMap.put("01ABC", 1000);
        myTreeMap.put("01ABD", 2000);
        myTreeMap.put("02ABC", 3000);
        myTreeMap.put("04ABC", 1000);

        myTreeMap.clear();

        if(!myTreeMap.isEmpty()) {
            System.out.println("myTreeMap is not empty");
        } else {
            System.out.println("myTreeMap is empty");
        }

        System.out.println("_________________________");

//        hashMap.remove(2);
//        System.out.println("HashMap contents: " + hashMap);
//
//        hashMap.remove(1, "Ferrari");
//        System.out.println("HashMap contents: " + hashMap);

        HashMap<String, String> myFirstMap = new HashMap<>();
        myFirstMap.put("A1", "John");
        myFirstMap.put("A2", "Sue");
        myFirstMap.put("A3", "Stewen");
        System.out.println("myFirstMap values: " + myFirstMap);

        HashMap<String, String> mySecondMap = new HashMap<>();
        mySecondMap.put("B1", "Viktor");
        mySecondMap.put("B2", "Svetlana");
        System.out.println("mySecondMap values: " + mySecondMap);

        myFirstMap.putAll(mySecondMap);
        System.out.println("myFirstMap values: " + myFirstMap);

        System.out.println("_________________________");

        for (Map.Entry entry : myFirstMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("_________________________");

        for (String entryKey: myFirstMap.keySet()) {
            System.out.println(entryKey);
        }

        System.out.println("_________________________");

        for (String entryValue: myFirstMap.values()) {
            System.out.println(entryValue);
        }

    }

}
