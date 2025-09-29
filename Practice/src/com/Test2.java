package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {
	
	public static void main(String[] args) {
		
		Map<String , List<String>> map1 = new HashMap<>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banana");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Mumbai");
		list2.add("Pune");
		
		map1.put("Fruits", list1);
		map1.put("Cities", list2);
		
		System.out.println("---Using forEach------");
		map1.forEach((k,v) ->{
			v.forEach(x -> System.out.println(x));
		});
		
	}

}
