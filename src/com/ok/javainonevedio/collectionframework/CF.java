package com.ok.javainonevedio.collectionframework;

import java.util.*;

public class CF {
    public static void main(String[] args) {
        // List --> ArrayList & LinkedList
        // Set --> HashSet & LinkedHashSet
        // Map --> HashMap & LinkedHashMap
        // int a = 1;
        //Integer b = 2;
        /*
        ArrayList<Integer> arrayList = new ArrayList();// It has array in it , By Default at the creation time the array
        arrayList.add(1);                              // size will be 10 and fast fill all the element then, new array
        arrayList.add(2);                              // array in form of 1.5x of previous one. and elements are
        arrayList.add(3);                              // transfer into new array.
        // arrayList.contains(2);
        //arrayList.get(2);
        //System.out.println(arrayList);
        //System.out.println(arrayList.contains(2));// true
        //System.out.println(arrayList.get(1));
        ArrayList<Integer> arrayList2 = new ArrayList();
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.addAll(arrayList2);
        System.out.println(arrayList);
        */
        //List<Integer> list = new LinkedList<>(); // It is the Doubly LinkedList, and LinkedList contains nodes
        //list.add(1);// It contains pointer with it.
        //list.add(2);
        //List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);// It is used to find in linear form
        // hash --> same input --> same output --> index
        //Set<Integer> set = new HashSet<Integer>();// Used to store unique values, finding is quickly (Directly)
        //set.add(1);
        //set.add(1);
        //set.add(1);
        //set.add(2);
        //set.add(3);
        //set.contains(2);
        //System.out.println(set);
        //Set<Integer> set = new LinkedHashSet<>();// It uses to maintain oder
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Astitva");
        map.put(2,"Barkha");
        map.put(3,"Divya");
        System.out.println(map.get(1));
    }
}
