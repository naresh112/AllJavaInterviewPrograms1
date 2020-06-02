package com.copleateCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Temp {
	public static void main(String[] args) {
		new Temp().sampleTemp();
		
	}
	public void tempPractice() {
		List<String> list1=new ArrayList<String>();
		list1.add("abc");
		list1.add("def");
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public static void sampleTemp() {
		List<String> list2=new ArrayList<>();
		list2.add("naresh");
		list2.add(1,"kumar");
		
		List<String> list3=new ArrayList<>();
		list3.addAll(2, list2);
		Iterator itr=list2.iterator();
		while(itr.hasNext()) {
			int i=0;
			System.out.println(itr.next()+" index is "+i++);
		}
	}
	

}
