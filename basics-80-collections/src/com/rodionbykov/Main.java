package com.rodionbykov;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "blah");
        hashMap.put(2, "bar");

        // prints previous value
        System.out.println(hashMap.put(1, "foo"));

        String bar = hashMap.get(1);
        System.out.println(bar);

        // with for loop
        for(Map.Entry pair : hashMap.entrySet()){
            Integer key = (Integer) pair.getKey();
            String value = (String) pair.getValue();

            System.out.println(key + ":" + value);
        }

        String[] arr = new String[]{"John", "James", "Jonah"};
        List<String> strings = Arrays.asList(arr);

        ArrayList<String> names = new ArrayList<>(strings);
        names.add("Jeremy");
        names.add( 2, "Johann");
        // will return negative, which means 'not found', that's because collection is unsorted
        System.out.println(Collections.binarySearch(names, "John"));

        Collections.sort(names);
        // that's better result
        System.out.println(Collections.binarySearch(names, "John"));

        for(String i : strings){
            System.out.println(i);
        }

        for(int j = 0; j < strings.size(); j++){
            System.out.println(strings.get(j));
        }

        HashSet<String> set = new HashSet<>();
        set.add("John");
        set.add("James");
        set.add("Jonah");
        System.out.println(set.toString());

        Iterator iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        for(String item : set){
            if(item.compareTo("Jonah") == 0){
                System.out.println(item.charAt(1));
                char[] arr2 = item.getChars(0, 2, arr2, 0);
                System.out.println(arr2);
                System.out.println(item.contains("Jo"));
                System.out.println(item.length());
            }
        }

    }
}
