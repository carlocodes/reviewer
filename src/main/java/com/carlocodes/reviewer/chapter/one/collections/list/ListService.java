package com.carlocodes.reviewer.chapter.one.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListService {
    public void myMethod() {
        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("Gian");
        myArrayList.add("Sean");
        myArrayList.add("Nina");

        System.out.println("My Array List Data: " + myArrayList);

        String names = String.join(" ", myArrayList);
        System.out.println("Names: " + names);

        List<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("Apple");
        myLinkedList.add("Banana");
        myLinkedList.add("Cherry");

        System.out.println("My Linked List Data: " + myLinkedList);

        List<String> vector = new Vector<>();
        vector.add("Vector 1");
        vector.add("Vector 2");
        vector.add("Vector 3");

        System.out.println("My Vector List Data: " + vector);

        List<String> copyOnWriteList = new CopyOnWriteArrayList<>();
        copyOnWriteList.add("Copy 1");
        copyOnWriteList.add("Copy 2");
        copyOnWriteList.add("Copy 3");

        System.out.println("My Copy On Write Array List: " + copyOnWriteList);
    }

    public static void main(String[] args) {
        ListService listService = new ListService();
        listService.myMethod();
    }
}
