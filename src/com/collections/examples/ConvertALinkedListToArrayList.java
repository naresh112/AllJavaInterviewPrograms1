package com.collections.examples;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertALinkedListToArrayList {
 public static void main(String[] args) {
	 
    LinkedList<String> linkedlist = new LinkedList<String>();
    linkedlist.add("Harry");
    linkedlist.add("Jack");
    linkedlist.add("Tim");
    linkedlist.add("Rick");
    linkedlist.add("Rock");

    List<String> list = new ArrayList<String>(linkedlist);

    for (String str : list){
      System.out.println(str);
    }
    System.out.println("**********");
    System.out.println(list);
    LinkedList<String> linklist2=new LinkedList(list);
    for(String str:linklist2) {
    	System.out.println(str);
    }
 }
}